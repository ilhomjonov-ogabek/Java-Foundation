package main;


import java.util.Scanner;

public class Main5 {
    public static void main(String[] args){
        int ball1,ball2,ball3,ball4,ball5;
        Scanner sc = new Scanner(System.in);
        System.out.print("1-talabaning balini kiriting:");
        ball1 = sc.nextInt();
        System.out.print("2-talabaning balini kiriting:");
        ball2 = sc.nextInt();
        System.out.print("3-talabaning balini kiriting:");
        ball3 = sc.nextInt();
        System.out.print("4-talabaning balini kiriting:");
        ball4 = sc.nextInt();
        System.out.print("5-talabaning balini kiriting:");
        ball5 = sc.nextInt();
        ball(ball1, ball2, ball3, ball4, ball5);
    }

    public static void ball(int ball1, int ball2, int ball3, int ball4, int ball5){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nechinchi o'quvchini bali kerak:");
        int res =   sc.nextInt();
        switch(res){
            case 1-> System.out.println(ball1);
            case 2-> System.out.println(ball2);
            case 3-> System.out.println(ball3);
            case 4-> System.out.println(ball4);
            case 5-> System.out.println(ball5);
        }
    }
}
