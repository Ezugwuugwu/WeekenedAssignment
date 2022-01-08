package ChapterFour;

import java.util.Scanner;

public class Factorials {
    Scanner input = new Scanner(System.in);
    int total =1;
    public void check_Factorials(){
        System.out.println("Enter a number to find its factorials");
       int number = input.nextInt();
        int i;
        for (i =1; i <= number; i++){
            total = total * i;
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("The factorial of "+number +" is "+total);
    }

    public double one_Factorial(){
        for (int i =1; i <= 1; i++){
           total = total * 1;
        }
        return total * 1.0;
    }

    public double two_Factorial(){
        for (int i =1; i <= 2; i++){
            total = total *1;
        }
        return total * 1.0;
    }

    public double three_Factorial(){
        for (int i =1; i < 3; i++){
            total = total * 1;
        }
        return total * 1.0;
    }

    public double maths_Constant(){
//     By formular,  e = 1 + 1/1! + 1/2! + 1/3!...
        double constant;
        constant =( 1 + (1/three_Factorial()) +(1/two_Factorial()) + (1/three_Factorial()));

        return constant;
    }

    public static void main(String[] args) {
        Factorials fac = new Factorials();
        fac.check_Factorials();
        System.out.println("Maths constant is "+fac.maths_Constant());
    }
}
