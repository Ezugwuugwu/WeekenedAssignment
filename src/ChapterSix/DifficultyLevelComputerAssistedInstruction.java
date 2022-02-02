package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class DifficultyLevelComputerAssistedInstruction {
    Scanner input = new Scanner(System.in);
    int studentAnswer = -1;
    SecureRandom randomNumber = new SecureRandom();
    int correctAnswerCounter = 0;
    int wrongAnswerCounter = 0;

    public void generate_Single_Digit_Random_Questions() {
        for (int i = 1; i <= 10; i++) {
            int firsSingleDigitRandomNumber = randomNumber.nextInt(10);
            int secondSingleDigitRandomNumber = randomNumber.nextInt(10);
            display_Single_Digit_Questions(firsSingleDigitRandomNumber, secondSingleDigitRandomNumber);
        }
    }

    public void generate_Double_Digits_Random_Questions() {
        for (int i = 1; i <= 10; i++) {
            int firstDoubleDigitsRandomNumber = randomNumber.nextInt(10, 50);
            int secondDoubleDigitsRandomNumber = randomNumber.nextInt(10, 50);
            display_Double_Digits_Questions(firstDoubleDigitsRandomNumber, secondDoubleDigitsRandomNumber);
        }
    }
    public void display_Single_Digit_Questions(int numberOne, int numberTwo) {
        int answer = (numberOne * numberTwo);
        System.out.println("What is the product of " + numberOne + " And " + numberTwo);
        int studentAnswer = input.nextInt();
        if (studentAnswer == answer) {
            correct_Answer_Message();
            correctAnswerCounter++;
        } else {
            wrong_Answer_Message();
            wrongAnswerCounter++;
        }
    }

    public void display_Double_Digits_Questions(int numberOne, int numberTwo) {
        int answer = (numberOne * numberTwo);
        System.out.println("What is the product of " + numberOne + " And " + numberTwo);
        int studentAnswer = input.nextInt();
        if (studentAnswer == answer) {
            correct_Answer_Message();
            correctAnswerCounter++;
        } else {
            wrong_Answer_Message();
            wrongAnswerCounter++;
        }
    }

    public void select_Difficult_Level() {
        String format = """
                Choose difficulty level:
                Enter 1 for level 1
                Enter 2 for lever 2
                """;
        System.out.println(format);
        int studentlevel = input.nextInt();
            switch (studentlevel) {
                case 1: generate_Single_Digit_Random_Questions();
                student_Performance_Check();
                break;
                case 2: generate_Double_Digits_Random_Questions();
                student_Performance_Check();
                break;
            }
    }

    public void student_Performance_Check() {
        if (correctAnswerCounter >= 7.5) {
            System.out.println("Congratulations! You are ready to go to the next" +
                    "level\n\n" + "Next student proceed to answer questions");
            select_Difficult_Level();
        } else {
            System.out.println("Please ask your teacher for extra help.\n\nNext student proceed to answer questions");
            select_Difficult_Level();
        }
    }

    public void correct_Answer_Message () {
            int correctAnswer = randomNumber.nextInt(1, 4);
            switch (correctAnswer) {
                case 1: System.out.println("Excellent");break;
                case 2: System.out.println("Very good");break;
                case 3: System.out.println("Nice work");break;
                case 4: System.out.println("Keep up the good work");break;
            }
    }

    public void wrong_Answer_Message () {
            int wrongAnswer = randomNumber.nextInt(1, 4);
            switch (wrongAnswer) {
                case 1: System.out.println("No, Please try again");break;
                case 2: System.out.println("Wrong! Try once more");break;
                case 3: System.out.println("Don't give up");break;
                case 4: System.out.println("No! keep trying");break;
            }
    }

        public static void main (String[]args){
            DifficultyLevelComputerAssistedInstruction difficultLevel = new DifficultyLevelComputerAssistedInstruction();
            difficultLevel.select_Difficult_Level();

        }
    }

