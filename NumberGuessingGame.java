import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(100);
        int i = 5;
        System.out.println(number);

        while (true) {
            System.out.print("Enter a number(You have " + i + " rights) : ");
            int prediction = scanner.nextInt();


            if(prediction < 0 || prediction > 100){
                System.out.println("The number you enter must be between 0 and 100!");
                i--;
            }if(prediction != number){
                System.out.println("You guessed wrong!");
                i--;
            }
            if (prediction == number) {
                System.out.println("You guessed right. Congratulations!");
            }
            if (i == 0){
                System.out.println("The correct number was " + number + ". you lost..");
                break;
            }
        }
    }
}
