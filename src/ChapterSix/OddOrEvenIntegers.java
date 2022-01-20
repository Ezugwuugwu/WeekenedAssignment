package ChapterSix;

import java.util.Scanner;

public class OddOrEvenIntegers {
    Scanner input = new Scanner(System.in);
    boolean isEven = true;

    public boolean is_Even(int integer){
        boolean itIsEven = integer % 2 ==0;
        if (itIsEven) return true;
        else return false;
    }

    public void input_And_Check_If_Integer_Is_Even(){
        int integer=0;
        while (integer != -1){
            System.out.println("Enter integer to check if it's an even number Or -1 to exit");
            integer = input.nextInt();
            boolean result = is_Even(integer);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        OddOrEvenIntegers number = new OddOrEvenIntegers();
        number.input_And_Check_If_Integer_Is_Even();
    }

}
