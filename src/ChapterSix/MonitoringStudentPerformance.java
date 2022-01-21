package ChapterSix;

import java.security.SecureRandom;
import java.util.Scanner;

public class MonitoringStudentPerformance {
    Scanner input = new Scanner(System.in);
    int studentAnswer = -1;
    SecureRandom randomNumber = new SecureRandom();
    int firstRandomNumber = randomNumber.nextInt(10);
    int secondRandomNumber = randomNumber.nextInt(10);
    int correctAnswerCount =0;
    int wrongAnswerCount =0;

    public void Generate_Random_Questions() {
        for (int i = 1; i <= 10; i++) {
            int firstRandomNumber = randomNumber.nextInt(10);
            int secondRandomNumber = randomNumber.nextInt(10);
            display_questions(firstRandomNumber, secondRandomNumber);
        }
    }
    public void display_questions(int numberOne, int numberTwo) {
        int answer = (numberOne * numberTwo);
            System.out.println("What is the product of " + numberOne + " And " + numberTwo);
            int studentAnswer = input.nextInt();
            if (studentAnswer == answer) {
                correct_Answer_Message();
                correctAnswerCount++;
            } else {
                wrong_Answer_Message();
                wrongAnswerCount++;
            }
    }


    public void Student_Performance_Check(){
        if (correctAnswerCount >= 7.5){
            System.out.println("Congratulations! You are ready to go to the next level\n\n" +
                    "Next student proceed to answer questions");
            Generate_Random_Questions();
        }else {
            System.out.println("Please ask your teacher for extra help.\n\nNext student proceed to answer questions");
            Generate_Random_Questions();
        }
    }

    public void correct_Answer_Message(){
        int correctAnswer = randomNumber.nextInt(1,4);
        switch (correctAnswer){
            case 1: System.out.println("Excellent");break;
            case 2: System.out.println("Very good");break;
            case 3: System.out.println("Nice work");break;
            case 4: System.out.println("Keep up the good work");break;
        }
    }

    public void wrong_Answer_Message(){
        int wrongAnswer = randomNumber.nextInt(1,4);
        switch (wrongAnswer){
            case 1: System.out.println("No, Please try again");break;
            case 2: System.out.println("Wrong! Try once more");break;
            case 3: System.out.println("Don't give up");break;
            case 4: System.out.println("No! keep trying");break;
        }
    }

    public static void main(String[] args) {
     MonitoringStudentPerformance studentPerformance = new MonitoringStudentPerformance();
     studentPerformance.Generate_Random_Questions();
     studentPerformance.Student_Performance_Check();
    }
}
