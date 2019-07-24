package com.akashgvalani;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private double inittransactionAmount;
    private ArrayList <Customer> customerLists;


    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerLists = new ArrayList <Customer>();
    }

    public ArrayList <Customer> getCustomerLists() {
        return customerLists;
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean newCustomer(String customerName, double initAmount) {
        if (findCustomer(customerName) == null) {
            this.customerLists.add(new Customer(customerName, initAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);

        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        } //if customer is on file

        return false;
    }

    private Customer findCustomer(String customerName) {
        Customer foundCustomer;
//        for(int i =0;i<customerLists.size();i++){
//            if(customerLists.contains(customerName))
//                return customerLists.get(i);
//        }
//        return null;

        for (int i = 0; i < this.customerLists.size(); i++) {
            Customer checkedCustomer = this.customerLists.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName))
                return checkedCustomer;
        }
        return null;
    }
}
