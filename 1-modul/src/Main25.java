import java.util.Scanner;

public class Main25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] array = new int[n];
        int n1 = 0;
        for(int i=0;i<n;i++){
            System.out.print("array["+i+"]:");
            array[i]=sc.nextInt();
            if(array[i]%2==1){
                n1++;
            }
        }

        int[] array1 = new int[n1];
        n1=0;
        for(int i=0;i<n;i++){
            if(array[i]%2==1){
              array1[n1]=array[i];
              n1++;
            }
        }
        for(int i=0;i<n1;i++) {
            System.out.print("array1["+i+"]:");
            System.out.println(array1[i]);
        }
    }
}
