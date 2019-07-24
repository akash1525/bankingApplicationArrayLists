package com.akashgvalani;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // You job is to create a simple banking application.
        // There should be a Bank class
        // It should have an arraylist of Branches
        // Each Branch should have an arraylist of Customers
        // The Customer class should have an arraylist of Doubles (transactions)
        // Customer:
        // Name, and the ArrayList of doubles.
        // Branch:
        // Need to be able to add a new customer and initial transaction amount.
        // Also needs to add additional transactions for that customer/branch
        // Bank:
        // Add a new branch
        // Add a customer to that branch with initial transaction
        // Add a transaction for an existing customer for that branch
        // Show a list of customers for a particular branch and optionally a list
        // of their transactions
        // Demonstration autoboxing and unboxing in your code
        // Hint: Transactions
        // Add data validation.
        // e.g. check if exists, or does not exist, etc.
        // Think about where you are adding the code to perform certain actions
        Bank bank = new Bank("Bank of America");
        bank.addBranch("Bryn Mawr");
        bank.addCustomer("Bryn Mawr", "Akash",300);
        bank.addCustomer("Bryn Mawr", "Charlie",200);
        bank.addCustomer("Bryn Mawr", "hylor",100);

        bank.addBranch("Devon");
        bank.addCustomer("Devon","Yarlapadti Chutiya", 100);


        bank.addCustomerTransaction("Bryn Mawr","Akash",122);
        bank.addCustomerTransaction("Bryn Mawr","Colby",12);
        bank.addCustomerTransaction("Bryn Mawr","Tylor",1);

        bank.listCustomers("Bryn Mawr",true);
        bank.listCustomers("Devon",true);

        if(!bank.addCustomer("Ardmore","Hefler",123)){
            System.out.println("Ardmore Branch does not exists");
        }

        if(!bank.addBranch("Devon")){
            System.out.println("Devon Branch already exists");
        }

        if(!bank.addCustomer("Ardmore","Akash",23)) {
            System.out.println("Customer Akash already exists");
        }
    }
}
