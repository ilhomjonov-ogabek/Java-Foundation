import java.util.Scanner;

public class Main18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Str satrni kiriting:");
        String str =  sc.nextLine();
        twoChar(str);

    }

    static void twoChar(String str){
        if(str.length()>=2) {
            System.out.println(str.substring(0, 2));
        }else{
            System.out.println(str);
        }
    }
}
