package com.tahabozdemir.ticketsystempattern.model;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Route {
    private String city;
    private int priority;
}
