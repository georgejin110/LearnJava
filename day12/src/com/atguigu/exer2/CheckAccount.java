package com.atguigu.exer2;

public class CheckAccount extends Account {

    private double overdraft; // 透支限额

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            System.out.println("取款金额: " + amount);
//            setBalance(getBalance() - amount);
            super.withdraw(amount);
        } else {
            if (amount - getBalance() > overdraft) {
                System.out.println("超过可透支额度, 您的余额为: " + getBalance());
            } else {
                overdraft -= amount - getBalance();
//                super.withdraw(getBalance());
                setBalance(0);
                System.out.println("本次透支了 " + (amount - getBalance()) + " 元");
                System.out.println("账户余额为: " + getBalance());
                System.out.println("透支余额为: " + overdraft);
            }
        }
    }
}
