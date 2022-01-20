package ChapterSix;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ModifiedGuessRandomNumber {
    Scanner input = new Scanner(System.in);
    Random random = new SecureRandom();
    final int maximumNumber = 15;
    int rightGuess = random.nextInt(maximumNumber);
    int count =1;

    public static void main(String[] args) {
        ModifiedGuessRandomNumber guessNumber = new ModifiedGuessRandomNumber();
        guessNumber.guess_number();
    }

    public void guess_number() {
        do {System.out.println("Enter an integer to guess");
           int guessed_Number = input.nextInt();
            check_Guessed_Number(guessed_Number);
        }while (true);
    }

    public void check_Guessed_Number(int guessed_Number) {
        if(guessed_Number < rightGuess) {System.out.println("Too low, try again");
        }else if(guessed_Number > rightGuess) {System.out.println("Too high, try again");
        }else if (guessed_Number == rightGuess) {System.out.println("Congrats!!! You guessed the number");
            try_again();
        }
        count = count +1;
        return;
    }

    public void try_again() {
        System.out.println("You played "+count+" times");
        if (count <= 10){System.out.println("Ahan You know the game");
        }else {System.out.println("You can do better");}

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
