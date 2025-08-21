import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sonini kiriting:");
        int n = sc.nextInt();
        int n1=0;
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int[] array1 = new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(array[j]!=array[i]){
                    System.arraycopy(array,i,array1,0,n);
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(array1[i]);
        }

    }
}
