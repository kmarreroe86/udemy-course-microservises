package com.in28minutes.micorservices.currencyconversionservice;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {

	@GetMapping("/currency-converter/from/{from}/to/{to}/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable final String from, @PathVariable final String to,
			@PathVariable final BigDecimal quantity) {

		return new CurrencyConversionBean(1L, from, to, BigDecimal.valueOf(65), quantity, quantity, 0);
	}
}
