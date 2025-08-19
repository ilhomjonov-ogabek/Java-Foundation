import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(same1(str));


    }


    public static String same1(String str) {
        String str1 = "", str2 = "",str3 = "";
        for (int i = 0; i < str.length()/2; i++) {
            str1 += str.charAt(i);
            str3 = str.substring(str.length()-i-1);
            if (str3.equals(str1)) {
                str2 += str1;

            }

            }
        return str2;


    }
}

