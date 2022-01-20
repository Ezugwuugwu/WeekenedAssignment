package ChapterSix;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
    Scanner input = new Scanner(System.in);
    Random random = new SecureRandom();
    final int maximumNumber = 15;
    int rightGuess = random.nextInt(maximumNumber);

    public static void main(String[] args) {
    GuessRandomNumber guessNumber = new GuessRandomNumber();
    guessNumber.guess_number();
    }

    public void guess_number() {
        int guessed_Number =0;
        do {
            System.out.println("Enter an integer to guess");
            guessed_Number = input.nextInt();
            check_Guessed_Number(guessed_Number);
        }while (true);
    }

    public void check_Guessed_Number(int guessed_Number) {
        if(guessed_Number < rightGuess) {
                System.out.println("Too low, try again");
           }else if(guessed_Number > rightGuess) {
                System.out.println("Too high, try again");
            }else if (guessed_Number == rightGuess) {
                System.out.println("Congrats!!! You guessed the number");
                try_again();
            }
    }

    public void try_again() {
        String format = """
                \nDo you wish to play again?
                Enter 1 if yes or 2 if No
                """;
        System.out.println(format.toUpperCase());
        int guessAgain = input.nextInt();
        switch (guessAgain) {
            case 1:
                guess_number();
                break;
            case 2:
                System.exit(2);
                break;
        }
    }
}
