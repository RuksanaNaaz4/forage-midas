package com.jpmc.midascore.model;

public class Transaction {

    private long amount;

    public long getAmount(){
        return amount;
    }

    public void setAmount(Long amount){
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Transaction{amount=" + amount + "}";
    }
    
}
