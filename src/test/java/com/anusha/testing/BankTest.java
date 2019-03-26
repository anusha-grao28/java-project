package com.anusha.testing;
import com.anusha.bank.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
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
    public void shouldGetPersonwithHighestTRansactionHistory() {

    Account anushaAccount = new Account(456123, "SBIK1014", 100);
    Account priyaAccount = new Account(789456, "SBIK1014", 200);
    Account dhanuAccount = new Account(951753, "SBIK1014", 300);

    List<Account> accounts = Arrays.asList(anushaAccount, priyaAccount, dhanuAccount);

    TransactionHistory anuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 125000);
    TransactionHistory anuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
    TransactionHistory anuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

    TransactionHistory priyaTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 250000);
    TransactionHistory priyaTranHist2 = new TransactionHistory("28-nov-2018", "current", 55000);
    TransactionHistory priyaTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 6000);

    TransactionHistory dhanuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 95000);
    TransactionHistory dhanuTranHist2 = new TransactionHistory("28-nov-2018", "current", 100000);
    TransactionHistory dhanuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);


    List<TransactionHistory> anuTransactionHistory = Arrays.asList(anuTranHist1, anuTranHist2, anuTranHist3);

    List<TransactionHistory> priyaTransactionHistory = Arrays.asList(priyaTranHist1, priyaTranHist2, priyaTranHist3);

    List<TransactionHistory> dhanuTransactionHistory = Arrays.asList(dhanuTranHist1, dhanuTranHist2, dhanuTranHist3);

    Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
    Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
    Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);

    List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);
    Bank bank = new Bank("SBI", "BNGLR", customerDetails);
    Customer actual = BankUtility.getCustomerWithHighestTRansactionHistory(bank);// return customer with highest thistory

  assertThat(actual, is(priya));
 assertThat(actual.getName(), is(priya.getName()));
   assertThat(actual.getName(),is("priya"));
}

@Test
    public void shouldGetAllCustomersForGivenIFSCCode(){

    Account anushaAccount = new Account(456123, "SBIK1014", 100);
    Account priyaAccount = new Account(789456, "SBIK1014", 200);
    Account dhanuAccount = new Account(951753, "SBIK1018", 300);

    List<Account> accounts = Arrays.asList(anushaAccount, priyaAccount, dhanuAccount);

    TransactionHistory anuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 125000);
    TransactionHistory anuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
    TransactionHistory anuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

    TransactionHistory priyaTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 250000);
    TransactionHistory priyaTranHist2 = new TransactionHistory("28-nov-2018", "current", 55000);
    TransactionHistory priyaTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 6000);

    TransactionHistory dhanuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 95000);
    TransactionHistory dhanuTranHist2 = new TransactionHistory("28-nov-2018", "current", 100000);
    TransactionHistory dhanuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);


    List<TransactionHistory> anuTransactionHistory = Arrays.asList(anuTranHist1, anuTranHist2, anuTranHist3);

    List<TransactionHistory> priyaTransactionHistory = Arrays.asList(priyaTranHist1, priyaTranHist2, priyaTranHist3);

    List<TransactionHistory> dhanuTransactionHistory = Arrays.asList(dhanuTranHist1, dhanuTranHist2, dhanuTranHist3);

    Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
    Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
    Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);

    List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);
    Bank bank = new Bank("SBI", "BNGLR", customerDetails);

    List<Customer> actual=BankUtility.getAllCustomersForGivenIFSCCode(bank,"SBIK1014");

    assertThat(actual,contains(anusha,priya));

}

@Test
    public void shouldGetAllCustomersForGivenTown(){
    Account anushaAccount = new Account(456123, "SBIK1014", 100);
    Account priyaAccount = new Account(789456, "SBIK1014", 200);
    Account dhanuAccount = new Account(951753, "SBIK1014", 300);

    List<Account> accounts = Arrays.asList(anushaAccount, priyaAccount, dhanuAccount);

    TransactionHistory anuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 125000);
    TransactionHistory anuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
    TransactionHistory anuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

    TransactionHistory priyaTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 250000);
    TransactionHistory priyaTranHist2 = new TransactionHistory("28-nov-2018", "current", 55000);
    TransactionHistory priyaTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 6000);

    TransactionHistory dhanuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 95000);
    TransactionHistory dhanuTranHist2 = new TransactionHistory("28-nov-2018", "current", 100000);
    TransactionHistory dhanuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);


    List<TransactionHistory> anuTransactionHistory = Arrays.asList(anuTranHist1, anuTranHist2, anuTranHist3);

    List<TransactionHistory> priyaTransactionHistory = Arrays.asList(priyaTranHist1, priyaTranHist2, priyaTranHist3);

    List<TransactionHistory> dhanuTransactionHistory = Arrays.asList(dhanuTranHist1, dhanuTranHist2, dhanuTranHist3);

    Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
    Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
    Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);

    List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);
    Bank bank = new Bank("SBI", "BNGLR", customerDetails);
    Bank bank1=new Bank("ICICI","BNGLR",customerDetails);

    List<Customer> actual=BankUtility.getAllCustomersForGivenTown(bank,"BNGLR");
    assertThat(actual,contains(anusha,priya,dhanu));
}

    @Test
    public void shouldGetCustomersBalanceBelow200(){
        Account anushaAccount = new Account(456123, "SBIK1014", 100);
        Account priyaAccount = new Account(789456, "SBIK1014", 200);
        Account dhanuAccount = new Account(951753, "SBIK1014", 300);

        List<Account> accounts = Arrays.asList(anushaAccount, priyaAccount, dhanuAccount);

        TransactionHistory anuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 125000);
        TransactionHistory anuTranHist2 = new TransactionHistory("28-nov-2018", "current", 50000);
        TransactionHistory anuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);

        TransactionHistory priyaTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 250000);
        TransactionHistory priyaTranHist2 = new TransactionHistory("28-nov-2018", "current", 55000);
        TransactionHistory priyaTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 6000);

        TransactionHistory dhanuTranHist1 = new TransactionHistory("8-Jun-2018", "savaings", 95000);
        TransactionHistory dhanuTranHist2 = new TransactionHistory("28-nov-2018", "current", 100000);
        TransactionHistory dhanuTranHist3 = new TransactionHistory("15-Mar-2018", "savaings", 5000);


        List<TransactionHistory> anuTransactionHistory = Arrays.asList(anuTranHist1, anuTranHist2, anuTranHist3);

        List<TransactionHistory> priyaTransactionHistory = Arrays.asList(priyaTranHist1, priyaTranHist2, priyaTranHist3);

        List<TransactionHistory> dhanuTransactionHistory = Arrays.asList(dhanuTranHist1, dhanuTranHist2, dhanuTranHist3);

        Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anuTransactionHistory);
        Customer priya = new Customer("priya", 22, "15-oct-96", priyaAccount, priyaTransactionHistory);
        Customer dhanu = new Customer("dhanu", 32, "05-jan-82", dhanuAccount, dhanuTransactionHistory);

        List<Customer> customerDetails = Arrays.asList(anusha, priya, dhanu);
        Bank bank = new Bank("SBI", "BNGLR", customerDetails);
       List<Customer> actual=BankUtility.getCustomersBalanceBelow200(bank,200);
       assertThat(actual,contains(anusha));

    }

    @Test
    public void shouldCheckForListSize(){
        List<TransactionHistory> tHistory=new ArrayList<TransactionHistory>() {};

        Comparator<TransactionHistory> highestValueComparator = new Comparator<TransactionHistory>() {
            @Override
            public int compare(TransactionHistory thistory1 , TransactionHistory thistory2) {
                return thistory2.getAmount()-thistory1.getAmount();
            }
        };
        Collections.sort(tHistory,highestValueComparator);

        System.out.println( tHistory.get(0));
    }

    @Test
    public void shouldGetCustomerHighestAge(){

        Account anushaAccount = new Account(456123, "SBIK1014", 100);
        Account gouthamAccount = new Account(789456, "SBIK1014", 200);

        TransactionHistory anushaTranHist1 = new TransactionHistory("12-Jun-2018", "savaings", 5000);
        TransactionHistory anushaTranHist2 = new TransactionHistory("30-nov-2018", "current", 2500);
        TransactionHistory anushaTranHist3 = new TransactionHistory("5-Mar-2018", "savaings", 500);

        TransactionHistory gouthamTranHist1 = new TransactionHistory("21-Jun-2018", "savaings", 100);
        TransactionHistory gouthamTranHist2 = new TransactionHistory("18-nov-2018", "current", 20000);
        TransactionHistory gouthamTranHist3 = new TransactionHistory("2-Mar-2018", "savaings", 200);

        List<TransactionHistory> anushaTransactionHistory = Arrays.asList(anushaTranHist1,anushaTranHist2,anushaTranHist3);
        List<TransactionHistory> gouthamTransactionHistory = Arrays.asList(gouthamTranHist1,gouthamTranHist2,gouthamTranHist3);

        Customer anusha = new Customer("anusha", 26, "28-mar-92", anushaAccount, anushaTransactionHistory);
        Customer goutham = new Customer("goutham", 35, "14-apr-85", anushaAccount, gouthamTransactionHistory);

        List<Customer> customerDetails = Arrays.asList(anusha, goutham);

        Bank bank = new Bank("SBI", "BNGLR", customerDetails);

        Customer highestCustomerAge=BankUtility.getCustomerAge(bank);

        Customer actual=highestCustomerAge;
        assertThat(goutham,is(actual));
    }

    @Test
    public void shouldGetHighestTransactionHistoryForCustomer(){

        Account gouthamAccount = new Account(789456, "SBIK1014", 200);

        TransactionHistory gouthamTranHist1 = new TransactionHistory("21-Jun-2018", "savaings", 100);
        TransactionHistory gouthamTranHist2 = new TransactionHistory("18-nov-2018", "current", 20000);
        TransactionHistory gouthamTranHist3 = new TransactionHistory("2-Mar-2018", "savaings", 200);

        List<TransactionHistory> gouthamTransactionHistory = Arrays.asList(gouthamTranHist1,gouthamTranHist2,gouthamTranHist3);

        Customer goutham = new Customer("goutham", 35, "14-apr-85", gouthamAccount, gouthamTransactionHistory);

        List<Customer> customerDetails = Arrays.asList(goutham);

            Bank bank = new Bank("SBI", "BNGLR", customerDetails);

            TransactionHistory actual=BankUtility.getHighestTransactionHistorys(goutham);

            assertThat(20000,is(actual.getAmount()));
        }

    }

