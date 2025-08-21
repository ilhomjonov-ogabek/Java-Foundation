import java.util.Scanner;

public class Main31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Str satrni kiriting:");
        String str=sc.nextLine();
        twoChars(str);
    }

    static void twoChars(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i));
            System.out.print(str.charAt(i));
        }
    }
}
