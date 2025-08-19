import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sonni kiriting:");
        byte number = sc.nextByte();
        byte res = ayirma(number);
        System.out.println(res);
    }

    public static byte ayirma(byte number) {
        byte num = (byte) (number & 0b11111100);
        return (byte) (number - num);
    }
}
