package com.learn.encap;

public class Account {

    private String name;
    private double money;
    private String passwd;

    public Account() {
    }

    public Account(String name, double money, String passwd) {
        setName(name);
        setMoney(money);
        setPasswd(passwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() < 2 || name.length() > 4) {
            System.out.println("名字必须在2-4位字符之间");
            this.name = null;
        } else {
            this.name = name;
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if (money <= 20) {
            System.out.println("余额必须大于20");
            this.money = 0;
        } else {
            this.money = money;
        }
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        if (passwd.length() != 6) {
            System.out.println("密码必须位6位");
            this.passwd = "000000";
        } else {
            this.passwd = passwd;
        }
    }

    public String info() {
        return "姓名: " + this.name + "\t余额: " + this.money +
                "\t密码: " +this.passwd;
    }
}
