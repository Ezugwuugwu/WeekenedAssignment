package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    Scanner input = new Scanner(System.in);
    int studentAnswer = -1;
    SecureRandom random = new SecureRandom();
    int firstRandomNumber = random.nextInt(10);
    int secondRandomNumber = random.nextInt(10);


    public void Generate_Random_Question() {
        System.out.println("How many number of questions do you wish to answer");
        int numberOfQuestion = input.nextInt();
        for (int i = 1; i <= numberOfQuestion; i++) {
            int firstRandomNumber = random.nextInt(10);
            int secondRandomNumber = random.nextInt(10);
            display_question(firstRandomNumber, secondRandomNumber);
        }
    }

    public void display_question(int numberOne, int numberTwo) {
        int answer = (numberOne * numberTwo);
        while (studentAnswer != answer) {
            System.out.println("What is the product of " + numberOne + " And " + numberTwo);
            int studentAnswer = input.nextInt();
            if (studentAnswer == answer) {
                System.out.println("Very good");
                break;
            } else {
                System.out.println("No! please try once more");
            }
        }
   }


    public static void main(String[] args) {
        ComputerAssistedInstruction instruction = new ComputerAssistedInstruction();
        instruction.Generate_Random_Question();
    }
}