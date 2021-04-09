package com.atguigu.exer1;

public class CylinderTest {

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2);
        cylinder.setLength(3);

        System.out.println("圆柱的半径:\t" + cylinder.getRadius());
        System.out.println("圆柱的高:\t\t" + cylinder.getLength());

        double volume = cylinder.findVolume();
        System.out.println("圆柱的体积:\t" + volume);

        double area = cylinder.findArea();
        System.out.println("圆柱的底面积:\t" + area);

    }
}
