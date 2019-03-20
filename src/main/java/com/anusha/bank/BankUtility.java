package com.anusha.bank;



import com.anusha.teams.Player;

import java.util.*;

public class BankUtility {


   static List<Customer> sortedCustomers;

    public static Customer getCustomerWithHighestDeposit(Bank bank)

    {
        List<Customer> customers=bank.getCustomers();
        System.out.println("before sorting");
      for (Customer cust:customers)
        {
            System.out.println("Customer "+cust.getName()+" having the deposit "+cust.getAccount().getAmount());
        }

        cc

        System.out.println("After sorting");
          for (Customer customer:customers)
            {
                System.out.println("Customer "+customer.getName()+" having the deposit "+customer.getAccount().getAmount());
            }

          // method expects a customer object to be returned
          return customers.get(0);

    }

    public static List<Customer> getCustomerBalanceByAscending(Bank bank){
        List<Customer> customers=bank.getCustomers();

        Comparator<Customer> amountComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getAccount().getAmount() - customer2.getAccount().getAmount();
            }
        };

        //lets look at api of sort
        Collections.sort(customers, amountComparator);
        return customers;
    }

    public static Customer getCustomerWithHighestTRansactionHistory(Bank bank){
        List<Customer> customers=bank.getCustomers();
        Comparator<Customer> transHistoryComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer2.gettHistory()-customer1.gettHistory();
            }
        };

        //lets look at api of sort
        Collections.sort(customers, transHistoryComparator);
        return customers.get(0);
    }
}
