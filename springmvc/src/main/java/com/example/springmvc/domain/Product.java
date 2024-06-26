package com.example.springmvc.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {
    private int id;
    private String title;
    private double price;
}
