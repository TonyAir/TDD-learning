package com.example.demo.tdd;

import java.util.Objects;

class Money {

    protected int amount;

    protected String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

     String currency(){
        return currency;
     }

    Money times(int multiplier){
        return new Money(multiplier*amount,currency);
    }

    static Money dollar(int amount){
        return new Money(amount,"USD");
    }

    static Money franc(int amount){
        return new Money(amount,"CHF");
    }



    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && currency().equals(money.currency());
    }

    public String toString(){
        return amount + " " + currency;
    }

}
