public class Main7 {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("\u001b[38;5;"+counter+"m"+counter+"\t");
                counter++;
            }
            System.out.println();
        }
    }
}
