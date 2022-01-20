package ChapterSix;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    Scanner input = new Scanner(System.in);
    int studentAnswer = -1;
    SecureRandom random = new SecureRandom();
    int firstRandomNumber = random.nextInt(10);
    int secondRandomNumber = random.nextInt(10);

    public void random_Question() {
        System.out.println("How many number of questions do you wish to answer");
        int numberOfQuestion = input.nextInt();
        for (int i = 1; i <= numberOfQuestion; i++) {
            SecureRandom random = new SecureRandom();
            int firstRandomNumber = random.nextInt(10);
            int secondRandomNumber = random.nextInt(10);
            question(firstRandomNumber, secondRandomNumber);
        }
    }
    public void question(int firstRandomNumber, int secondRandomNumber) {
        int answer = (firstRandomNumber * secondRandomNumber);
            System.out.println("What is the product of " + firstRandomNumber + " And " + secondRandomNumber);
            int studentAnswer = input.nextInt();
            if (studentAnswer == answer){
                System.out.println("Very good");
            }else {
                System.out.println("Wrong! Try another");
            }
        }

    public static void main(String[] args) {
        ComputerAssistedInstruction instruction = new ComputerAssistedInstruction();
        instruction.random_Question();
    }
}