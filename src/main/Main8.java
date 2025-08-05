package main;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        int n;
        n =  sc.nextInt();
        System.out.println(missingChar(str,n));

    }
    public static String missingChar(String str, int n) {
        String str1="";
        for(int i = 0; i<str.length(); i++){
            if(n!=i){
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

}
