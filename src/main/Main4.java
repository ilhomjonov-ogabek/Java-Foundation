package main;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, num1, num2, num3;
        System.out.print("1-sonni kiriting:");
        num = sc.nextDouble();
        System.out.print("2-sonni kiriting:");
        num1 = sc.nextDouble();
        System.out.print("3-sonni kiriting:");
        num2 = sc.nextDouble();
        System.out.print("4-sonni kiriting:");
        num3 = sc.nextDouble();
        double res = arf(num, num1, num2, num3);
        System.out.println("Natija:" + res);


    }

    public static double arf(double num, double num1, double num2, double num3) {
        double arf = (num+num1+num2+num3)/4.0;
        return arf;

    }
}
