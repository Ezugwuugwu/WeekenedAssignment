package ChapterSix;

import java.util.Scanner;

public class ReversingDigits {
    int reversed = 0;
    public void input_Integers(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits");
        int numb = input.nextInt();
        System.out.println("Original Number: " + numb);
        reverse_Input(numb);
    }

        public void reverse_Input(int numb){
            while(numb != 0) {
                int digit = numb % 10;
                reversed = reversed * 10 + digit;
                numb = numb/ 10;
            }
            System.out.println("Reversed Number: " + reversed);
        }

    public static void main(String[] args) {
        ReversingDigits digits = new ReversingDigits();
        digits.input_Integers();
    }

}
