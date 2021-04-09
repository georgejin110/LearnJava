package com.learn.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("老母猪");
        person.setAge(90);
        person.setSalary(1.2);
        System.out.println(person.info());

        System.out.println("============");
        Person alex = new Person("alex", 2000, 1.4);
        System.out.println(alex.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // 加入对数据的校验
        if (name.length() < 2 || name.length() > 6) {
            System.out.println("名字必须在2-6个字符内");
            this.name = null;
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 1 || age > 120) { // 如果不合理
            System.out.println("年龄需要在1-120");
            this.age = 18;
        } else {
            this.age = age;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "姓名："+this.name+"\t"+
                            "年龄：" + this.age + "\t" +
                            "收入：" +this.salary;
    }
}