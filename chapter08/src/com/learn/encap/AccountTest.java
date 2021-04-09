package com.learn.encap;

public class AccountTest {

    public static void main(String[] args) {
        Account coco = new Account("coco", 41, "123456");
        System.out.println(coco.info());

        Account alex = new Account();
        alex.setName("alex");
        alex.setPasswd("654321");
        alex.setMoney(24);
        System.out.println(alex.info());
    }
}
