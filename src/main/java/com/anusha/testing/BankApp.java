package com.anusha.testing;

import com.anusha.bank.Account;
import com.anusha.bank.Bank;
import com.anusha.bank.Customer;
import com.anusha.bank.TransactionHistory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankApp {
    public static void main(String[] args) {

        // all accounts belong to same bank, then why different IFSC code? i
        Account anushaAccount = new Account(456123, "SBIK1014", 650000);
        Account priyaAccount = new Account(789456, "SBIK1014", 9541236);
        Account dhanuAccount = new Account(951753, "SBIK1014", 2501478);

        ArrayList<Account> accounts = new ArrayList<>();

        accounts.add(anushaAccount);
        accounts.add(priyaAccount);
        accounts.add(dhanuAccount);

        TransactionHistory anuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 25000);
        TransactionHistory anuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
        TransactionHistory anuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

        TransactionHistory priyaTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 25000);
        TransactionHistory priyaTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
        TransactionHistory priyaTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

        TransactionHistory dhanuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 25000);
        TransactionHistory dhanuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
        TransactionHistory dhanuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);


        ArrayList<TransactionHistory> anuTransactionHistory = new ArrayList<>();
        anuTransactionHistory.add(anuTranHist1);
        anuTransactionHistory.add(anuTranHist2);
        anuTransactionHistory.add(anuTranHist3);

        ArrayList<TransactionHistory> priyaTransactionHistory = new ArrayList<>();
        anuTransactionHistory.add(priyaTranHist1);
        anuTransactionHistory.add(priyaTranHist2);
        anuTransactionHistory.add(priyaTranHist3);

        ArrayList<TransactionHistory> dhanuTransactionHistory = new ArrayList<>();
        anuTransactionHistory.add(dhanuTranHist1);
        anuTransactionHistory.add(dhanuTranHist2);
        anuTransactionHistory.add(dhanuTranHist3);

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


    }
}
