import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1-sonni kiriting:");
        int n = sc.nextInt();
        System.out.print("2-sonni kiriting:");
        int n1 = sc.nextInt();
        System.out.println(maxNum(n,n1));

    }

    public static int maxNum(int num,int num1) {
        if(num>10 && num<20 &&  num1>10 && num1<20){
            if(num>num1){
                return num;
            }else{
                return num1;
            }
        }else if(num>10 && num<20){
            return num;
        }else if(num1>10 && num1<20){
            return num1;
        }
        return 0;
    }
}
