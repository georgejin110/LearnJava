package com.atguigu.exer2;

public class AccountTest {

    public static void main(String[] args) {

        Account acc1 = new Account(1122, 20000, 0.045);
        acc1.withdraw(40000);
        System.out.println("您的账户余额为: " + acc1.getBalance());
        System.out.println();
        acc1.deposit(500);
        acc1.print();
    }
}
