import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonni kiriting:");
        int n = sc.nextInt();
        System.out.print("Sonning darajasini kiriting:");
        int m = sc.nextInt();
        System.out.println(powerNumber(n,m));
    }

    static int powerNumber(int n,int m){
        if(m==0){
            return 1;
        }
        return(n*powerNumber(n,m-1));
    }
}
