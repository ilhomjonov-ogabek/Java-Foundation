import java.util.Scanner;

public class Main30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("Str satrni kiriting:");
        String str=sc.nextLine();
        System.out.println(numberCode(str,n));

    }

    static int numberCode(String str,int n){
        for(int i=0;i<str.length()-3;i++){
            if(str.charAt(i)=='c'&& str.charAt(i+1)=='o'&& str.charAt(i+3)=='e'){
                n++;
            }
        }
        return n;
    }
}
