package ChapterSix;

import java.util.Scanner;

public class Exponentiation {
    int baseNumber, exponent;
    public void collect_input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base number");
      baseNumber = input.nextInt();

        System.out.println("Enter the exponent");
      exponent = input.nextInt();
    }

    public void display_results(){
        int all_Result =  calculate_Exponent(baseNumber, exponent);
        System.out.println(all_Result);
    }

    public int calculate_Exponent(int baseNumber, int exponent){
        int answer =1;
        if (baseNumber >0 && exponent ==0) {
            return answer;
        }
        if (baseNumber ==0 && exponent >=0){
                return 0;
            }else {
            for (int i =1; i <=exponent;i++){
              answer = answer * baseNumber;
            }
        }
            return answer;
    }
    public static void main(String[] args) {
        Exponentiation expo = new Exponentiation();
        expo.collect_input();
        expo.display_results();
    }
}
