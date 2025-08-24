import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Satrni kiriting:");
        String str = sc.nextLine();
        System.out.println(isNotEquals(str));

    }
    public static boolean isNotEquals(String str){
        int n = 0;
        int m = 0;
        for(int i=0;i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("is")){
                n++;
            }
        }
        for(int i=0;i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("not")){
                m++;
            }
        }
        if(n==m){
            return true;
        }
        return false;
    }
}
