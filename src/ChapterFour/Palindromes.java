package ChapterFour;

import java.util.Scanner;

public class Palindromes {
    Scanner input = new Scanner(System.in);
    private static int number, number1, number2, number3, number4, number5;
    public void chek_For_Palindromes(){
do {    System.out.println("Enter number to check if it is a palindrome");
        number = input.nextInt();
        number1 = number/10000;
        number2 = (number % 10000)/1000;
        number3 = ((number % 10000) % 1000)/100;
        number4 = (((number % 10000) % 1000) % 100)/10;
        number5 = (((number % 10000) % 1000) % 100) % 10;

    String value = String.valueOf(number);
    if (value.length() ==5){
        if(number1 == number5){
            if(number2 == number4){System.out.println("The number is a Plaindrome");}}

        if(number1 != number5){
            if(number2 != number4){System.out.println("The number is not a Plaindrome");}}
    }else {
        System.out.println("Wrong!!! Integer must be five");
    }

    }while (true);
    }

    public static void main(String[] args) {
        Palindromes palindromes = new Palindromes();
        palindromes.chek_For_Palindromes();
    }
}
