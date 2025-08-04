package main;

import java.util.Scanner;

public class Main3 {

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
        double res = max1(num, num1, num2, num3);
        System.out.println("Natija:" + res);


    }

    public static double max1(double num, double num1, double num2, double num3) {
        double max = num;
        if (num1 > max) {
            max = num1;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
