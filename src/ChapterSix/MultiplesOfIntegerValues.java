package ChapterSix;

import java.util.Scanner;

public class MultiplesOfIntegerValues {
    boolean isTrue = true;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        MultiplesOfIntegerValues integers = new MultiplesOfIntegerValues();
        integers.collect_And_Check_If_Input_Is_Multiple();
    }

    public void collect_And_Check_If_Input_Is_Multiple(){
        int secondInteger =0,firstInteger=0;
        while (firstInteger != -1 || secondInteger != -1){
            System.out.println("\nEnter two integers to see if the second is a multiple of the first input 0r -1 to exit");
            firstInteger = input.nextInt();
            secondInteger = input.nextInt();
            if (firstInteger == -1 )
                return;

            boolean results = is_Multiple(firstInteger, secondInteger);
            System.out.println(results);
        }
    }

    public boolean is_Multiple(int firstNumber, int secondNumber){
        boolean isMultiple = secondNumber %firstNumber ==0;
        if (isMultiple)
            return isTrue;

        else return false;
    }
}
