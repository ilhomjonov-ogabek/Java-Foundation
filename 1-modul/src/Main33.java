
import java.util.Random;
import java.util.Scanner;

public class Main33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ismingizni kiriting:");
        String name = sc.nextLine();
        Random rand=new Random();
        int years = rand.nextInt(10,40);
        System.out.printf("Salom %s, Siz %d yoshdamisiz?%n",name,years);
    }
}
