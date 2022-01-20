package ChapterSix;

import java.util.Scanner;

public class SeparatingDigits {
    Scanner input = new Scanner(System.in);

    public void input_Digits(){
        System.out.println("Enter four digits");
        int digits = input.nextInt();
        String stringValue = String.valueOf(digits);
        if (stringValue.length() == 4){
            separate_Digits(digits);
        }else {
            System.out.println("Input must be four integers");
        }
    }

    public void separate_Digits(int digits){
        int firstDigit = digits/1000;
        int secondDigit = (digits%1000)/100;
        int thirdDigit = (digits % 100)/10;
        int fourtDigit = (digits % 10);
        System.out.printf("%s%3s%3s%3s",firstDigit, secondDigit, thirdDigit,fourtDigit);
    }

    public static void main(String[] args) {
        SeparatingDigits digits = new SeparatingDigits();
        digits.input_Digits();
    }
}
