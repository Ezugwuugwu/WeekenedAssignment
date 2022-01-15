package ChapterFive;

import java.util.Scanner;

public class SmallestValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest_Number = Integer.MAX_VALUE;

        for (int i =1; i <= 5; i++ ){
            System.out.println("Eneter 5 digits to find the smallest among them");
            int number = input.nextInt();

            if (smallest_Number > number){
                smallest_Number = number;
            }
        }
        System.out.println("The smallest number is "+smallest_Number);

    }
}
