import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Str satrni kiriting:");
        String str =  sc.nextLine();
        twoChar(str);

    }

    static void twoChar(String str){
        if(str.length()>=2) {
            String str1 = str.substring(0, 2);
            System.out.println(str1.repeat(3));
        }else{
            System.out.println(str.repeat(3));
        }
    }
}
