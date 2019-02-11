package com.example.demo.tdd;

abstract class Money {


    abstract String currency();

    protected int amount;

    protected String currency;

     Money times(int multiplier){
        return new Money(amount*multiplier,currency);
    }

    static Dollar dollar(int amount){
        return new Dollar(amount,"USD");
    }

    static Franc franc(int amount){
        return new Franc(amount,"CHF");
    }

    public boolean equals(Object o) {
        Money money = (Money) o;
        return amount == money.amount && currency().equals(money.currency());
    }



}
