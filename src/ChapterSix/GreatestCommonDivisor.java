package ChapterSix;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static int gcd(int firstNumber, int secondNumber){
        int greatestCommonDivisor =1;
        for (int i = 1; i <=firstNumber && i <= secondNumber; i++){
            if (firstNumber % i ==0 && secondNumber % i ==0){
                greatestCommonDivisor =i;
            }
        }
        return greatestCommonDivisor;
    }

    public static void input_Integers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int digits =  gcd(firstNumber, secondNumber);
        System.out.println("The greatest divisor is "+digits);
    }

    public static void main(String[] args) {
    GreatestCommonDivisor divisor = new GreatestCommonDivisor();
    input_Integers();
    }
}
