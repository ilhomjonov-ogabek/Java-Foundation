import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = sc.nextInt();
        int b= n;
        double result = 1;
        double result1 = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<b;j++){
                result *= a;
            }
            b--;
            result1 += result;
            result = 1;
        }
        System.out.println(result1);
    }
}
