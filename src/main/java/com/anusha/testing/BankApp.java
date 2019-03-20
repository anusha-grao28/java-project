package com.anusha.testing;

import com.anusha.bank.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {

        // all accounts belong to same bank, then why different IFSC code? i
        Account anushaAccount = new Account(456123, "SBIK1014", 100);
        Account priyaAccount = new Account(789456, "SBIK1014", 200);
        Account dhanuAccount = new Account(951753, "SBIK1014", 300);

        List<Account> accounts = Arrays.asList(anushaAccount,priyaAccount,dhanuAccount);

        TransactionHistory anuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 25000);
        TransactionHistory anuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
        TransactionHistory anuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

        TransactionHistory priyaTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 25000);
        TransactionHistory priyaTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
        TransactionHistory priyaTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

        TransactionHistory dhanuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 25000);
        TransactionHistory dhanuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
        TransactionHistory dhanuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);


        List<TransactionHistory> anuTransactionHistory = Arrays.asList(anuTranHist1,anuTranHist2,anuTranHist3);

        List<TransactionHistory> priyaTransactionHistory = Arrays.asList(priyaTranHist1,priyaTranHist2,priyaTranHist3);

       List<TransactionHistory> dhanuTransactionHistory =Arrays.asList(dhanuTranHist1,dhanuTranHist2,dhanuTranHist3);

        //useless code
        //you have already instantiated arraylist above and filled it with objects.. you can use that
        // List<Account> accountDetails=Arrays.asList(anushaAccount,priyaAccount,dhanuAccount);
        //List<TransactionHistory> transHistory=Arrays.asList(anuTranHist1,anuTranHist2,anuTranHist3);

        Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
        Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
        Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);

        anusha.setAccount(anushaAccount);
        priya.setAccount(priyaAccount);
        dhanu.setAccount(dhanuAccount);

        List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);

        Bank bank = new Bank("SBI", "BNGLR", customerDetails);

        Customer highestAmountCustomer = BankUtility.getCustomerWithHighestDeposit(bank);

        System.out.println("Customer with highest bank balance is "+ highestAmountCustomer.getName() + " with value "+highestAmountCustomer.getAccount().getAmount());
    }
}
