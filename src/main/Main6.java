package main;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+"-talabni balini kiriting:");
            arr[i] = sc.nextInt();
        }
        int num;
        System.out.print("Nechinchi talabani bali kerak:");
        num = sc.nextInt();
        switch (num){
            case 1 -> System.out.println(arr[0]);
            case 2 -> System.out.println(arr[1]);
            case 3 -> System.out.println(arr[2]);
            case 4 -> System.out.println(arr[3]);
            case 5 -> System.out.println(arr[4]);
        }
    }

}
