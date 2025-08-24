import java.util.Scanner;

public class Main9 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter start:");
    int start = sc.nextInt();
    System.out.print("Enter end:");
    int end = sc.nextInt();
    newArray(start, end);

  }

  public static void newArray(int start, int end) {
    int n = end - start;
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
      array[i] = start;
      start++;
    }
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + ",");
    }
  }
}
