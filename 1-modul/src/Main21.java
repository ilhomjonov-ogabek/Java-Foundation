import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Str satrni kiriting:");
        String str = sc.nextLine();
        System.out.println(bobWord(str));

    }

    static boolean bobWord(String str){
        for (int i = 1; i < str.length()-1; i++) {
            if (str.charAt(i-1) == 'b'&&str.charAt(i+1) == 'b') {
                return true;
            }
        }
        return false;
    }
}
