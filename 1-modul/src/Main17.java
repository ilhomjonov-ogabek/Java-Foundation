import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1-sozni kiriting:");
        String a =  sc.nextLine();
        System.out.print("2-sozni kiriting:");
        String b =  sc.nextLine();
        abba(a,b);

    }

    static void abba(String a, String b) {
        System.out.println(a + b + b + a);
    }
}
