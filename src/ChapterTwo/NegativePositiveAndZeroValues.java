package ChapterTwo;

import java.util.Scanner;

public class NegativePositiveAndZeroValues {
        Scanner input = new Scanner(System.in);
        int positive_Value_Counter =0;
        int negative_Value_Counter =0;
        int zero_Value_Counter =0;

public void input_Integers(){
    for (int i =1; i <=5; i++){
        System.out.println("Enter five integers");
        int numbers = input.nextInt();
        if (numbers >0){
            positive_Value_Counter = positive_Value_Counter +1;
        }
        if (numbers < 0){
            negative_Value_Counter = negative_Value_Counter +1;
        }
        if (numbers ==0){
            zero_Value_Counter = zero_Value_Counter + 1;
        }
    }
}


    public static void main(String[] args) {
    NegativePositiveAndZeroValues values = new NegativePositiveAndZeroValues();
    values.input_Integers();
        System.out.println("Number of positive input: "+values.positive_Value_Counter);
        System.out.println("Number of negative input: "+values.negative_Value_Counter);
        System.out.println("Number of zero input: "+values.zero_Value_Counter);

    }

}
