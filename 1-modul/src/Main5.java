import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        String res = toreverse(a,b);
        System.out.println(res);

    }

    public static String toreverse(String a,String b){
        String d="";
        for(int i=0;i<a.length();i++){
            String c =a.substring(i,i+b.length());
            if(c.equals(b)){
                for(int j=c.length()-1;j>=0;j--){
                    d += c.charAt(j);
                }
                a=d+a.substring(b.length());

            }

        }
        return d+a.substring(b.length());
    }
}
