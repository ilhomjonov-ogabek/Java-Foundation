public class Main13 {
    public static void main(String[] args) {
        int n=8;
        System.out.println(fibonacci(n));

    }
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        for (int i = 1; i < n; i++) {
            int temp = f1;
            f1 = f0 + f1;
            f0 = temp;
        }
        return f1;

    }
}
