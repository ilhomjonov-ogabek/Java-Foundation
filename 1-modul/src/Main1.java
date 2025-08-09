import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonni kiriting:");
        int n=sc.nextInt();
        res(n);
    }

    public static void res(int n) {
        int a=1;
        if (n <= 10 && n >= 1) {
            for (int i = n; i >0 ; i--) {
                for (int j = 0; j <=a ; j++) {
                    System.out.print(" ");
                    System.out.println(i);
                    a++;
                }
            }
        }
    }
}
