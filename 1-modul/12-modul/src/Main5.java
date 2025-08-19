import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        res(n);
    }

   public static void res(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>1;j--){
                System.out.print(" ");
            }
            System.out.println(i);
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
