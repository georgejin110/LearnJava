package com.atguigu.exer;

public class KidsTest {

    public static void main(String[] args) {
        Kids k1 = new Kids(12);
        k1.printAge();

        k1.setSalary(0);
        k1.setSex(1);
        k1.employee();
        k1.manOrWoman();
    }
}
