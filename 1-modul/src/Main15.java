import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonni kiriting:");
        int n = sc.nextInt();
        System.out.println(number(n));

    }

    static int number(int n ){

        if(n==0){
            return 0;
        }
        if (n % 10 ==8){
            return 1+number(n/10);
        }
        return number(n/10);
    }
}
