package com.SavingAccount;

import java.util.Random;


public class SavingAccount {
        Random obj=new Random();
        long accountNumber;
        String holderName;

    public Random getObj() {
        return obj;
    }

    public void setObj(Random obj) {
        this.obj = obj;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public int getWithdrawlAmount() {
        return withdrawlAmount;
    }

    public void setWithdrawlAmount(int withdrawlAmount) {
        this.withdrawlAmount = withdrawlAmount;
    }

    double balance;
        String status;
        float deposit;
        int withdrawlAmount;

        public SavingAccount(String lalit) {
        }


        public double withdrawl(double balance) {
            return balance-withdrawlAmount;

        }public long accountNumber() {
            return (long) Math.random() * 1000000000000L;
        }


        public void generateAccountNumber() {
        }

         public float deposit(float deposit){
            return (float) (balance+deposit);
        }
        public float transfer(float transfer){
            return (float) (balance+transfer);
        }
        public float checkBalance(float balance){
            return balance;
        }





}





