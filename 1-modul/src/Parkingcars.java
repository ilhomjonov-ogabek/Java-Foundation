import java.util.Scanner;

public class Parkingcars {
    public static void main(String[] args) {
        String[][] matrix = {
                {"✅", "✅", "✅", "✅", "✅"},
                {"✅", "✅", "✅", "✅", "✅"},
                {"✅", "✅", "✅", "✅", "✅"},
        };
        while (true) {
            int n = displayMenu();
            switch (n) {
                case 1 -> displayPark(matrix);
                case 2 -> availablePlacesCount(matrix);
                case 3 -> enterCar(matrix);
                case 4 -> outCar(matrix);
                case 5 -> {
                    System.out.println("Bye");
                    System.exit(0);
                }
                default -> System.out.println("Invalid input");
            }

        }

    }

    private static void outCar(String[][] matrix) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int row = sc.nextInt();
        System.out.print("Enter cell:");
        int cell = sc.nextInt();
        if (matrix[row-1][cell-1] == "\uD83D\uDE97") {
            matrix[row-1][cell-1] = "✅";
            System.out.println("Car outed!");
        } else {
            System.out.println("There is no car in this place!");
            outCar(matrix);
        }

    }

    private static int displayMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                1.Display park 
                2.Available places count and places
                3.Enter car
                4.Out car
                5.Exit park
                """);
        System.out.print("Choose your choice:");
        int n = sc.nextInt();
        return n;
    }

    private static void enterCar(String[][] matrix) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row:");
        int row = sc.nextInt();
        System.out.print("Enter cell:");
        int cell = sc.nextInt();
        if (matrix[row-1][cell-1] == "✅") {
            matrix[row-1][cell-1] = "\uD83D\uDE97";
            System.out.println("Car parked!");
        } else {
            System.out.println("This place is not available!");
            enterCar(matrix);
        }
    }

    private static void availablePlacesCount(String[][] matrix) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + 1 + "-row:");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("✅")) {
                    System.out.print((j + 1) + ",");
                    count++;
                }
            }
            System.out.println();
        }
        System.out.println("Avaible places count:" + count);
    }

    public static void displayPark(String[][] matrix) {
        for (String[] row : matrix) {
            for (String cell : row) {
                System.out.printf("%s\t", cell);
            }
            System.out.println();

        }
    }
}

