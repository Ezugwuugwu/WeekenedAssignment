package ChapterTwo;

import java.util.Scanner;

public class Multiples {
    Scanner input = new Scanner(System.in);
    public void check_Number_Multiple(){
        System.out.println("Enter first number");
       int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();


        if (firstNumber % secondNumber ==0){
            System.out.println(firstNumber +" Is a multiple of "+secondNumber);
        }else {
            System.out.println(firstNumber +" Is not a multiple of " +secondNumber);
        }
    }

    public static void main(String[] args) {
        Multiples numbers = new Multiples();
        numbers.check_Number_Multiple();
    }
}
