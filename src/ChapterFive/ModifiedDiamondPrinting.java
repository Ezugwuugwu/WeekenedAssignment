package ChapterFive;

import java.util.Scanner;

public class ModifiedDiamondPrinting {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int i, j, space = 1;
        System.out.print("Enter the number of rows: ");
        int number;
        number = input.nextInt();
        System.out.println();
        space = number - 1;

        if (number % 2 != 0 && number <= 19) {
        for (j = 1; j <= number; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        space = 1;
        for (j = 1; j <= number - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2 * (number - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }else {
            System.out.println("Input must be odd number and must be less than or equall to 19");
        }
    }
}
