package com.anusha.bank;

public class Account {
    private Integer accountNumber;
private String IFSCcode;
private Integer amount;

    public Account(Integer accountNumber, String IFSCcode, Integer amount) {
        this.accountNumber = accountNumber;
        this.IFSCcode = IFSCcode;
        this.amount = amount;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getIFSCcode() {
        return IFSCcode;
    }

    public void setIFSCcode(String IFSCcode) {
        this.IFSCcode = IFSCcode;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", IFSCcode='" + IFSCcode + '\'' +
                ", amount=" + amount +
                '}';
    }
}
