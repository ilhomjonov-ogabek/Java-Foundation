public class Main10 {
    public static void main(String[] args) {
        long fibonacci100 = fibonacci(13);
        System.out.println(fibonacci100);

    }
    static long fibonacci(int n) {
        long f0 = 0;
        long f1 = 1;
        for (int i = 1; i <= n; i++) {
            long temp = f1;
            f1 = f0 + f1;
            f0 = temp;
        }
        return f1;
    }
}
