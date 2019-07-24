package com.akashgvalani;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    ArrayList<Branch> branchesLists;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchesLists = new ArrayList <Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName)== null) {
            this.branchesLists.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName,String customerName, double initialAmount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName,initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        Customer foundCustomer;
//        for(int i =0;i<customerLists.size();i++){
//            if(customerLists.contains(customerName))
//                return customerLists.get(i);
//        }
//        return null;

        for (int i = 0; i < this.branchesLists.size(); i++) {
            Branch chekedBranch = this.branchesLists.get(i);
            if (chekedBranch.getBranchName().equals(branchName))
                return chekedBranch;
        }
        return null;
    }

    public boolean listCustomers(String branchName,boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Below are the lists of customers for "+branch.getBranchName());
            ArrayList<Customer> branchCustomers = branch.getCustomerLists();
            for (int i =0;i<branchCustomers.size();i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer "+branchCustomer.getCustomerName()+"["+(i+1)+"]");
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransctionsLists();
                    for(int j=0;j<transactions.size();j++){
                        System.out.println("["+(j+1)+"] Amount "+ transactions.get(j));
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }
}
