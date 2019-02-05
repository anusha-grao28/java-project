package com.anusha.bank;

import java.util.Date;

public class TransactionHistory {
    private String date;
    private  String transactionType;
    private Integer amount;

    public TransactionHistory(String date, String transactionType, Integer amount) {
        this.date = date;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionHistory{" +
                "date='" + date + '\'' +
                ", transactionType='" + transactionType + '\'' +
                ", amount=" + amount +
                '}';
    }
}
