import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonni kiriting:");
        int n=sc.nextInt();
        System.out.print("Sonning darajasini kiriting:");
        int a=sc.nextInt();
        System.out.println( res(n,a));

    }

    public static int res(int n,int a){
        if (a==0){
            return 1;
        }
        return n*res(n,a-1);
    }
}
