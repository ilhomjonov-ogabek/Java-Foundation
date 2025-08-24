import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Massiv uzunligini kiriting:");
        int n = sc.nextInt();
        int [] array = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("array["+i+"]=");
            array[i] = sc.nextInt();
        }
        System.out.println(num(array));

    }
    public static int num(int[] array){
        int res = 0;
        int res1 = 0;
        int a=0;
        int b=0;
        for(int i = 0; i < array.length; i++){
            res += array[i];
            if(array[i] == 6){
                 a = i;
            }
            if(array[i] == 7){
                 b = i;
            }

        }
        if(a<b){
            for(int j = a;j<=b;j++){
                res1 += array[j];
            }
        }
        int result =res - res1;
        return (result);
    }
}
