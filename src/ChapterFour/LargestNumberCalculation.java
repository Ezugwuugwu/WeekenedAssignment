package ChapterFour;

import java.util.Scanner;

public class LargestNumberCalculation {
    Scanner input = new Scanner(System.in);
    private int number, counter =0;
    int maximum = Integer.MIN_VALUE;

    public void calculate_Largest_Number(){
        for (int i = 0; i <=9; i++){
            counter = counter + 1;
            System.out.println("Enter a number");
            number = input.nextInt();
            if (maximum < number){
                maximum = number;
            }
        }
        System.out.println("Largest number is "+ maximum);
        System.out.println("Number registered is "+counter);
        //        while (counter <=10){
//            counter = counter + 1;
//            System.out.println("Enter a number");
//            number = input.nextInt();
//            if (maximum < number){
//                maximum = number;
//            }
//        }
//        System.out.println("Largest number is "+ maximum);
    }

    public static void main(String[] args) {
        LargestNumberCalculation number = new LargestNumberCalculation();
        number.calculate_Largest_Number();
    }
}
