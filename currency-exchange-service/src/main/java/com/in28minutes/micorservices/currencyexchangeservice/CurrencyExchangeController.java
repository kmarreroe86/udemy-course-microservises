package com.in28minutes.micorservices.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.micorservices.currencyexchangeservice.beans.ExchangeValue;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environmet;
	
	@Autowired
	private ExchangeValueRepository repository;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable final String from, @PathVariable final String to) {

		ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(environmet.getProperty("local.server.port")));
		
		
		
		return exchangeValue;
	}
}
