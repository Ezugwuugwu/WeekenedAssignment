package ChapterSix;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        input_Numbers();
    }

    public static double mimimum3(double firstNumber, double sendonNumber, double thirdNumber){
        double result = Math.min(firstNumber,Math.min(sendonNumber, thirdNumber));

        return result;
    }

    public static void input_Numbers(){
        Scanner input = new Scanner(System.in);

            System.out.println("Enter an a value");
            double firtInput = input.nextDouble();
            System.out.println("Enter second input");
            double secondInput = input.nextDouble();
            System.out.println("Enter third input");
            double thirdInput = input.nextDouble();

        System.out.println("Minimum is "+mimimum3(firtInput, secondInput, thirdInput));

    }
}
