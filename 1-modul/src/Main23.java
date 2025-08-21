import java.util.Scanner;

public class Main23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini kiriting:");
        int n = sc.nextInt();
        n=n+1;
        int[] arr = new int[n];
        arr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*2;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }


    }

   /* static int[] ndegree(int n){
        int[] array = new int[n];
        array[0] = 1;
        for(int i=1;i<n;i++){
            array[i] = array[i-1]*2;
        }
        return array;
    }*/
}
