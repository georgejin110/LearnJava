package com.atguigu.exer2;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getMoneylyInterest() {
        return annualInterestRate / 12;
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return;
        }
        System.out.println("余额不足");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return;
        }
        System.out.println("存款必须大于0");
    }

    public void print() {
        System.out.println("您的账户余额为: " + balance);
        System.out.println("月利率为: " + getMoneylyInterest());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
