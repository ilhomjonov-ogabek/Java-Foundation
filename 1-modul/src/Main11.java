import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonni kiriting 100-999 oralig'ida bo'lsin:");
        int n = sc.nextInt();
        if(n>=100 & n<=999) {
            int n1 = n % 10;
            int n10 = n / 10 % 10;
            int n100 = n / 100;
            String result = "";
            switch (n100) {
                case 1 -> result += "bir yuz ";
                case 2 -> result += "ikki yuz ";
                case 3 -> result += "uch yuz ";
                case 4 -> result += "to'rt yuz ";
                case 5 -> result += "besh yuz ";
                case 6 -> result += "olti yuz ";
                case 7 -> result += "yetti yuz ";
                case 8 -> result += "sakkiz yuz ";
                case 9 -> result += "to'qqiz yuz ";
            }
            switch (n10) {
                case 1 -> result += "o'n ";
                case 2 -> result += "yigirma ";
                case 3 -> result += "o'ttiz ";
                case 4 -> result += "qirq ";
                case 5 -> result += "ellik ";
                case 6 -> result += "oltmish ";
                case 7 -> result += "yetmish ";
                case 8 -> result += "sakson ";
                case 9 -> result += "to'qson ";
            }

            switch (n1) {
                case 1 -> result += "bir  ";
                case 2 -> result += "ikki  ";
                case 3 -> result += "uch  ";
                case 4 -> result += "to'rt  ";
                case 5 -> result += "besh  ";
                case 6 -> result += "olti  ";
                case 7 -> result += "yetti  ";
                case 8 -> result += "sakkiz  ";
                case 9 -> result += "to'qqiz  ";
            }

            System.out.println(result);
        }else{
            System.out.println("Xatolik son 100-999 oraliqda bo'lsin!");
        }

    }
}
