package com.anusha.bank;



import com.anusha.teams.Player;
import javafx.collections.transformation.TransformationList;


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
        Comparator<Customer> amountComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer2.getAccount().getAmount() - customer1.getAccount().getAmount();
            }
        };



        Collections.sort(customers, amountComparator);

        System.out.println("After sorting");
          for (Customer customer:customers)
            {
                System.out.println("Customer "+customer.getName()+" having the deposit "+customer.getAccount().getAmount());
            }

          // After sorting
        //Customer anusha having the deposit 100 ==  get(0)
        //Customer priya having the deposit 200  == get(1)
        //Customer dhanu having the deposit 300 == get(2)

        //sp after sorting the highest deposit customer is at bottom and lowest deposit is at top
        // /i have not compared amount in utility , wait i vil compare values
          return customers.get(0);

    }

    public static List<Customer> getCustomersByBalanceAscending(Bank bank){
        List<Customer> customers=bank.getCustomers();

        Comparator<Customer> amountComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getAccount().getAmount() - customer2.getAccount().getAmount();
            }
        };

        Collections.sort(customers, amountComparator);
        return customers;
    }

    public static Customer getCustomerWithHighestTRansactionHistory(Bank bank){
        List<Customer> customers=bank.getCustomers();
        Comparator<Customer> transHistoryComparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {

               TransactionHistory cust1TransHistory = getHighestTransactionHistory(customer1);
               TransactionHistory cust2TransHistory = getHighestTransactionHistory(customer2);
                return cust2TransHistory.getAmount() - cust1TransHistory.getAmount();
            }
        };

        Collections.sort(customers, transHistoryComparator);
        return customers.get(0);
    }

    public static TransactionHistory getHighestTransactionHistory(Customer customer){

        List<TransactionHistory> tHistory=customer.gettHistory();

        Comparator<TransactionHistory> highestValueComparator = new Comparator<TransactionHistory>() {
            @Override
            public int compare(TransactionHistory thistory1 , TransactionHistory thistory2) {
                return thistory2.getAmount()-thistory1.getAmount();
            }
        };

        Collections.sort(tHistory,highestValueComparator);


        return tHistory.get(0);
    }

  public  static Customer getCustomerAge(Bank bank){
      List<Customer> customers=bank.getCustomers();
      Comparator<Customer> ageComparator = new Comparator<Customer>() {
          @Override
          public int compare(Customer customer1, Customer customer2) {
              return customer2.getAge() - customer1.getAge();
          }
      };


      Collections.sort(customers, ageComparator);
      return customers.get(0);
  }

  public static TransactionHistory getHighestTransactionHistorys(Customer customer){
      List<TransactionHistory> tHistory=customer.gettHistory();
      Comparator<TransactionHistory> tHistoryComparator = new Comparator<TransactionHistory>() {
          @Override
          public int compare(TransactionHistory tHist1, TransactionHistory tHist2) {
              return tHist2.getAmount() - tHist1.getAmount();
          }
      };

      Collections.sort(tHistory, tHistoryComparator);
      return tHistory.get(0);
  }

public static List<Customer> getAllCustomersForGivenIFSCCode(Bank bank, String ifscCode){
      List<Customer> customers=bank.getCustomers();
    List<Customer> ifScList = new ArrayList<>();
    for (Customer cust:customers){
          if(cust.getAccount().getIFSCcode().equals(ifscCode)){
              ifScList.add(cust);
          }
      }
      return ifScList;
}

public static List<Customer> getAllCustomersForGivenTown(Bank bank, String townName){
    List<Customer> customers=bank.getCustomers();
    List<Customer> townList = new ArrayList<>();
    for(Customer cust:customers){
        if(bank.getTownName().equals(townName)){
            townList.add(cust);
        }
    }
    return townList;
}

public static List<Customer> getCustomersBalanceBelow200(Bank bank,Integer amount){
    List<Customer> customers=bank.getCustomers();
    List<Customer> balanceList = new ArrayList<>();
    for(Customer cust:customers){
        if(cust.getAccount().getAmount()<amount){
            balanceList.add(cust);
        }
    }
    return balanceList;
}

public static List<TransactionHistory> getAllTransactionHistoryForGivenTransactionType(Customer customer,String transactionType){
        List<TransactionHistory> tHistory=customer.gettHistory();
    List<TransactionHistory> tHistoryList=new ArrayList<>();
    for(TransactionHistory tHist:tHistory){
        if(tHist.getTransactionType().equals(transactionType))
        tHistoryList.add(tHist);
    }
    return tHistoryList;
}

public static List<TransactionHistory> getAllTransactionHistoryBeforeAGivenDate(Customer customer,String date){
    List<TransactionHistory> tHistory=customer.gettHistory();
    List<TransactionHistory> tHistDateList=new ArrayList<>();
    for(TransactionHistory tHist:tHistory){
        // your date is in String ... you have to convert it to date object  and then compare
        // what does string comparision do ?
        // it only compares characters in a string
        /// so "hello".equals("hello") will return true
        // so first , find how to convert string to date object
        // then find how to compare dates ..
        // then put the logic here  ? ok ? artha aiytha ?
        // have a look at Date object in java , hu
        if(tHist.getDate().equals(date))
            tHistDateList.add(tHist);
    }
    return tHistDateList;
}

public static List<TransactionHistory> getAllTransactionHistoryAfterAGivenDate(Customer customer,String date){
    List<TransactionHistory> tHistory=customer.gettHistory();
    List<TransactionHistory> tHistDateList=new ArrayList<>();
    for(TransactionHistory tHist:tHistory){
        if(tHist.getDate().equals(date))
            tHistDateList.add(tHist);
    }
    return tHistDateList;
}
}
