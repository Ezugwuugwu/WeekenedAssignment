package ChapterSix;

import java.util.Scanner;

public class SquareOfAnyCharacter {
    Scanner input = new Scanner(System.in);

    public void length_Of_Sides(int number, char character){
        for (int i =1; i <=number; i++){
            for (int j =1; j <=number; j++){
                System.out.print(character);
            }
            System.out.println();
        }
    }

    public void input_Size_Of_Length(){
        System.out.println("Enter length of the square");
        int number = input.nextInt();
        length_Of_Sides(number, '@');
    }

    public static void main(String[] args) {
       SquareOfAnyCharacter character = new SquareOfAnyCharacter();
        character.input_Size_Of_Length();
    }
}
