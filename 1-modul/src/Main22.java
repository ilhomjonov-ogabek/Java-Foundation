import java.util.Scanner;

public  class Main22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arry = {3,12,4,5,15,35,56};
        String str = "[";
        for(int i=0;i<arry.length;i++){
                if(arry[i]==15) {
                    str = str + "o'n besh";
                }else if(arry[i]==5){
                    str = str + "besh" ;
                }else if(arry[i]==3){
                    str = str + "uch";
                }else{
                    str = str + arry[i];
                }
                if(i<arry.length-1){
                    str = str + ",";
                }
        }
        str = str + "]";
        System.out.println(str);
    }
}