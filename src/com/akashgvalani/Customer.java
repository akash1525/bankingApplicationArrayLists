package com.akashgvalani;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactionsLists;

    public Customer(String customerName,double initAmount) {
        this.customerName = customerName;
        this.transactionsLists = new ArrayList <Double>(); // great place for initializing a variable, A constructor
        addTransaction(initAmount);
    }

    public void addTransaction(double amount){
        this.transactionsLists.add(amount); //Demonstrated autoBoxing
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList <Double> getTransctionsLists() {
        return transactionsLists;
    }
}
