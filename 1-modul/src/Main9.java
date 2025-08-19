import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        int min = getUserInputAsInt("Enter min number:");
        int max = getUserInputAsInt("Enter max number:");
        int number = generateNumber(min, max);
        int tryCount = 3;

        while (tryCount >= 0) {
            tryCount--;
            int guessedNumber = getUserInputAsInt("Try to find : ");
            if(tryCount == guessedNumber){
                System.out.println("You win 🙌🙌");
                break;
            }else{
                System.out.println("Wrong number try again 😒😒 : ");
            }
            if(tryCount == 0){
                System.out.println("You lost👌");
                break;
            }
        }
    }

    static int generateNumber(int min, int max){
        return (int) Math.round(Math.random()*(max-min)+min);
    }

    static int getUserInputAsInt(String hint){
        Scanner scanner = new Scanner(System.in);
        System.out.print(hint);
        return scanner.nextInt();
    }
}
