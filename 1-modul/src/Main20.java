import java.util.Scanner;

public class Main20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Str satrni kiriting:");
        String str = sc.nextLine();
        System.out.println(lastChars(str));
    }

    static boolean lastChars(String str){
        String str1 = str.substring(str.length()-2);
        if(str1.equals("ly")){
            return true;
        }
        return false;
    }
}
