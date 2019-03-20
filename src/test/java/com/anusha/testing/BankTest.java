package com.anusha.testing;
import com.anusha.bank.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class BankTest {

@Test
    public void shouldGetPersonWithHighestBalance(){
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

    Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
    Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
    Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);

    List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);
    Bank bank = new Bank("SBI", "BNGLR", customerDetails);
    Customer highestAmountCustomer = BankUtility.getCustomerWithHighestDeposit(bank);

    Customer actual=highestAmountCustomer;
    assertThat("dhanu",is(actual.getName()));
    Account actuals=dhanuAccount;
    assertThat(300,is(actuals.getAmount()));

}

@Test
    public void shouldSortCustomerByBalanceAscendinng(){
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

    Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
    Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
    Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);
    List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);

    Bank bank = new Bank("SBI", "BNGLR", customerDetails);
    List<Customer> customerBalanceInAscending = BankUtility.getCustomerBalanceByAscending(bank);

    System.out.println(customerDetails);
    List<Customer> actual= customerBalanceInAscending;
    System.out.println(customerDetails);
    assertThat(customerDetails, is(actual));


}

@Test
    public void shouldSortCustomerByBalanceDescending(){

}

@Test
    public void shouldGetPersonwithHighestTRansactionHistory(){

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

    Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
    Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
    Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);

    List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);
    Bank bank = new Bank("SBI", "BNGLR", customerDetails);
}

@Test
    public void shouldGetPersonWithMultipleAccounts(){

}

@Test
    public void shouldGetAllCustomersWithSameIFSCCode(){

}

@Test
    public void shouldGetCustomersBalanceBelow200(){}

    @Test
    public void shouldGetCustomersFromSameTown(){}

   }
