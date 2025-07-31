package main;

import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        int birthYear = sc.nextInt();
        userInfo(name,age,birthYear);
    }

    public static void userInfo(String name, int age, int birthYear){
        System.out.println("Sizning ismingiz "+name+" siz "+birthYear+" yilda tug'gulgansz.");
        System.out.println("Siz "+ age+"yoshdasz.");
    }
}
