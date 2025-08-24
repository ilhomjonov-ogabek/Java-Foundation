import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Satrni kiriting:");
        String str = sc.nextLine();
        System.out.println(numbersNum(str));

    }

    public static int numbersNum(String str){
        int res = 1;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                res *= Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return res;
    }
}
