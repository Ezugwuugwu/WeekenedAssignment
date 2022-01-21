package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class ReducingStudentsFatigueCAI {
    Scanner input = new Scanner(System.in);
    int studentAnswer = -1;
    SecureRandom randomNumber = new SecureRandom();
    int firstRandomNumber = randomNumber.nextInt(10);
    int secondRandomNumber = randomNumber.nextInt(10);

    public void Generate_Random_Question() {
        System.out.println("How many number of questions do you wish to answer");
        int numberOfQuestion = input.nextInt();
        for (int i = 1; i <= numberOfQuestion; i++) {
            int firstRandomNumber = randomNumber.nextInt(10);
            int secondRandomNumber = randomNumber.nextInt(10);
            display_question(firstRandomNumber, secondRandomNumber);
        }
    }
    public void display_question(int numberOne, int numberTwo) {
        int answer = (numberOne * numberTwo);
        while (studentAnswer != answer) {
            System.out.println("What is the product of " + numberOne + " And " + numberTwo);
            int studentAnswer = input.nextInt();
            if (studentAnswer == answer) {
               correct_Answer_Comment();
                break;
            } else {wrong_Answer_Comment();}
        }
    }


    public void correct_Answer_Comment(){
        int correctAnswer = randomNumber.nextInt(1,4);
        switch (correctAnswer){
            case 1: System.out.println("Excellent");break;
            case 2: System.out.println("Very good");break;
            case 3: System.out.println("Nice work");break;
            case 4: System.out.println("Keep up the good work");break;
        }
    }

    public void wrong_Answer_Comment(){
        int wrongAnswer = randomNumber.nextInt(1,4);
        switch (wrongAnswer){
            case 1: System.out.println("No, Please try again");break;
            case 2: System.out.println("Wrong! Try once more");break;
            case 3: System.out.println("Don't give up");break;
            case 4: System.out.println("No! keep trying");break;
        }
    }

    public static void main(String[] args) {
       ReducingStudentsFatigueCAI studentFatigue = new ReducingStudentsFatigueCAI();
       studentFatigue.Generate_Random_Question();
    }
}
