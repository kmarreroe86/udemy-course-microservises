package com.in28minutes.microservices.currencyconversionservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CurrencyConversion {

    private Long id;

    private String from;

    private String to;

    private BigDecimal quantity;

    private BigDecimal conversionMultiple;

    private BigDecimal totalCalculateAmount;

    private String environment;
}
