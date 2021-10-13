package com.ecommerce.shop.data.model;

public enum Currency {

    NGN("Naira"), USD("Dollar"), SRC("Singapore Dollars"), GBP("British Pounds"), FRC("Francs"), GHC("Ghana Cedis");

    private String name;
    Currency(String s) {
        this.name = s;
    }

    private String getName(){
        return name;
    }
}
