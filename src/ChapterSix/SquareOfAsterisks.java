package ChapterSix;

import java.util.Scanner;

public class SquareOfAsterisks {
    public static void main(String[] args) {
        SquareOfCharacters(4,'*');
    }

    public static void SquareOfCharacters (int side, char asterisks){
        for (int i=1; i<=side;i++){
            for(int j=1; j<=side;j++)
                System.out.print(asterisks);
            System.out.println();
        }
    }
}
