package com.example.demo.tdd;

public class Franc extends Money{


    Franc(int amount,String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

}
