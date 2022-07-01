package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    private final Environment environment;

    private final CurrencyExchangeRepository repository;

    public CurrencyExchangeController(Environment environment, CurrencyExchangeRepository repository) {
        this.environment = environment;
        this.repository = repository;
    }

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ResponseEntity<CurrencyExchange> getExchangeValue(@PathVariable String from, @PathVariable String to) {
        var currencyExchange = repository.findByFromAndTo(from, to);
        if (currencyExchange == null) {
            throw new CurrencyExchangeNotFoundException(String.format("Unable to find data for %s to %s", from, to));
        }

        var port = environment.getProperty("local.server.port");

        currencyExchange.setEnvironment(port);
        return ResponseEntity.ok(currencyExchange);
    }
}
