package ChapterTwo;

import java.util.Scanner;

public class LargestAndMinimumNumber {
    Scanner input = new Scanner(System.in);
    int number;
    int maximumNumber = Integer.MIN_VALUE;
    int minimumNumber = Integer.MAX_VALUE;

    public void collect_Five_Integer_Input(){
        for (int i = 1; i <=5; i++){
            System.out.println("Enter a numbner");
            number = input.nextInt();

            if (maximumNumber < number){
                maximumNumber =number;
            }
            if (minimumNumber > number){
                minimumNumber = number;
            }
        }
        System.out.println("Largest Number is "+maximumNumber);
        System.out.println("Minimum Number is "+minimumNumber);
    }

    public static void main(String[] args) {
        LargestAndMinimumNumber maxMin = new LargestAndMinimumNumber();
        maxMin.collect_Five_Integer_Input();
    }

}
