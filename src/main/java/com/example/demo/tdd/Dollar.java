package com.example.demo.tdd;

public class Dollar extends Money{

    Dollar(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

}
