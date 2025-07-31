package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c, d;
        System.out.print("1-sonni kiriting:");
        c = sc.nextInt();
        System.out.print("2-sonni kiriting:");
        d = sc.nextInt();
        System.out.print("Natija:");
        System.out.println(findMax(c,d));
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}