package main;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Ismingizni kiriting:");
        name = sc.nextLine();
        greeting(name);

    }

    public static void greeting(String name) {
        System.out.println("Salom "+name);
    }
}
