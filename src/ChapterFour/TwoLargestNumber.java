package ChapterFour;

import java.util.Scanner;

public class TwoLargestNumber {

    private int counter =0;
    int largestNumber =0;
    int secondLargestNumber =0;

    public void _2LargestNumber(){
        Scanner input = new Scanner(System.in);
        for (int i =1; i <=10; i++){
            counter = counter + 1;
            System.out.println("Eneter an integer");
            int integer = input.nextInt();

            if (integer >= largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber =integer;
            }else {
                if (integer > secondLargestNumber){
                    secondLargestNumber =integer;
                }
            }
        }
        System.out.println("Largest number is "+largestNumber);
        System.out.println("Second Largest Number is "+secondLargestNumber);
    }

    public static void main(String[] args) {
        TwoLargestNumber largests = new TwoLargestNumber();
        largests._2LargestNumber();
    }

}
