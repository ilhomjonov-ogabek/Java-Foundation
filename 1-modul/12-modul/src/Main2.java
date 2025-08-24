import java.util.Scanner;

public class Main2 {

  static int sumOfDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return (n % 10) + sumOfDigits(n / 10);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int sum = sumOfDigits(number);
    System.out.println("Raqamlari yig'indisi:" + sum);
  }
}
