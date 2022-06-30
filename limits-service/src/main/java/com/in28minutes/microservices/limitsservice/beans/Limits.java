package com.in28minutes.microservices.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Limits {

    private int minimum;

    private int maximum;
}
