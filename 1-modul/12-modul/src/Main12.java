import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {1,2,6,6,7,3,6,6};
        System.out.println(num(array));
    }

    public static int num(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]==6) {
                if (array[i+1]==6||array[i+1]==7) {
                    count++;
                }
            }
        }
        return count;
    }
}
