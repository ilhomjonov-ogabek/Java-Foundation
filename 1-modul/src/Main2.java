import java.util.Scanner;
import java.util.Random;


public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        res(n);
    }

    public static void res(int n) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] nums = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nums[i][j] = rand.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == (n - 1) / 2 ) {
                    System.out.print(nums[i][j]);
                } else if(i == (n - 1) / 2) {
                    System.out.print(nums[i][j]);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
