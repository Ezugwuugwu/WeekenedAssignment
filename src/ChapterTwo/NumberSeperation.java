package ChapterTwo;

import java.util.Scanner;

public class NumberSeperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers");
        int number = input.nextInt();
        String value = String.valueOf(number);

if (value.length() ==5){
    int digit1 = number / 10000;
    int digit2 = (number % 10000)/1000;
    int digit3 = (number % 1000) /100;
    int digit4 = (number % 100) /10;
    int digit5 = (number % 10);
    System.out.printf("%d %d %d %d %d",digit1, digit2, digit3, digit4, digit5);

}else {
    if (value.length() < 5){
        System.out.println("Integer less than five");
    }else {
        if (value.length() > 5){
            System.out.println("Integer greater than five");
        }
    }
}
    }
}
