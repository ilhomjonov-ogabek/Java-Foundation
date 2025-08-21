import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("array["+i+"]:");
            array[i]=sc.nextInt();
        }

        int min = array[0];
        for(int i=0;i<n;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
    }


}

