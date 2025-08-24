import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = {4, 5, 6, 45, 99, 13, 4, 5, 6};
        int n = 3;
        System.out.println(arrayNums(array, n));

    }

    public static boolean arrayNums(int[] array, int n) {
        String str = "";
        for (int j = 0; j < array.length; j++) {
            str += array[j];
        }
        if (str.substring(0, n).equals(str.substring(str.length() - n))) {
            return true;
        }
        return false;
    }
}
