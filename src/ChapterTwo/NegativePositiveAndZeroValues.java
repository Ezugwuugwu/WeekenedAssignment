package ChapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positive_Counter =0;
        int negative_Counter =0;
        int zero_Counter =0;


        for (int i =1; i <=5; i++){
            System.out.println("Enter five integers");
            int numbers = input.nextInt();
            if (numbers >0){
                positive_Counter = positive_Counter +1;
            }
            if (numbers < 0){
                negative_Counter = negative_Counter +1;
            }
            if (numbers ==0){
                zero_Counter = zero_Counter + 1;
            }
        }
        System.out.println("Number of positive input: "+positive_Counter);
        System.out.println("Number of negative input: "+negative_Counter);
        System.out.println("Number of zero input: "+zero_Counter);
    }
}
