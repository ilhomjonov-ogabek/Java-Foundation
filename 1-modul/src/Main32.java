import java.util.Scanner;

public class Main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.print("Str satrni kiriting:");
        String str=sc.nextLine();
        System.out.println(numberCode(str,n));

    }

    static int numberCode(String str,int n){
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)=='h'&& str.charAt(i+1)=='i'){
                n++;
            }
        }
        return n;
    }
}
