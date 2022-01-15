package ChapterTwo;

import java.util.Scanner;

public class OddOREvenNumber {
    Scanner input = new Scanner(System.in);
    public  void check_If_Odd_Or_Even_Number(){
        System.out.println("Enter a number to check if it's even or odd numbner");
        int number = input.nextInt();

        if (number % 2 ==0){
            System.out.println(number+" is an even numnber");
        }else {
            System.out.println(number+" is an odd number");
        }
    }

    public static void main(String[] args) {
        OddOREvenNumber input = new OddOREvenNumber();
        input.check_If_Odd_Or_Even_Number();
    }
}
