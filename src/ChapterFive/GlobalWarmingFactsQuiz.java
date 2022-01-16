package ChapterFive;

import java.util.Scanner;

public class GlobalWarmingFactsQuiz {
    Scanner input = new Scanner(System.in);
    int counter =0;
    public void get_questions(){
       String question1 = """
               1-Global warming also refers to as
               (A) Climate change
                              
               (B) Ecological change
                              
               (C) Atmosphere change
                              
               (D) None of the above
               """;
        System.out.println(question1);

        String question2 = """
                2-Global warming is observed century-scale rise in the _______ of the Earth’s climate system.
                                
                (A) Maximum temperature
                                
                (B) Minimum temperature
                                
                (C) Average temperature
                                
                (D) Temperature
                """;
        System.out.println(question2);

        String question3 = """
                3-Which of the following is not a greenhouse gas?
                                
                (A) Carbon di-oxide
                                
                (B) Methane
                                
                (C) Nitrous oxide
                                
                (D) Carbon monoxide
                """;
        System.out.println(question3);

        String question4 = """
                4-Which of the following is (are) the anticipated effect(s) of Global warming?
                                
                (A) Rising sea levels
                                
                (B) Changing precipitation
                                
                (C) Expansion of deserts
                                
                (D) All of the above
                """;
        System.out.println(question4);

        String question5 = """
                5-UNFCCC stands for
                                
                (A) United Nations Framework Convention on Climate Change
                                
                (B) United Nations Federation Convention on Climate Change
                                
                (C) United Nations Framework Council on Climate Change
                                
                (D) United Nations Federation Council on Climate Change
                """;
        System.out.println(question5);
    }


    public void provide_answers(){
        System.out.println("PROVIDE ANSWERS TO THE QUESTIONS ABOVE HERE:");
        System.out.println("Question One ----");
        String question1 = input.nextLine();
        if (question1.equals("A")){
            System.out.println("Correct");
            counter++;
        }else {System.out.println("Wrong");}


        System.out.println("Question Two ----");
        String question2 = input.nextLine();
        if (question2.equals("B")){
            System.out.println("Correct");
            counter++;
        }else{System.out.println("Wrong");}


        System.out.println("Question Three---");
        String question3 = input.nextLine();
        if (question3.equals("C")){
            System.out.println("Correct!!!");
            counter++;
        }else{System.out.println("Wrong");}


        System.out.println("Question four---");
        String question4 = input.nextLine();
        if (question4.equals("D")){
            System.out.println("Correct");
            counter++;
        }else{System.out.println("Wrong");}


        System.out.println("Question Five---");
        String question5 = input.nextLine();
        if (question5.equals("A")){
            System.out.println("Correct");
            counter++;
        }else{System.out.println("Wrong");}
        System.out.println("Correct answer(s): "+counter);


        if (counter == 5) {
            System.out.println("Excellent Score");}
        if (counter == 4){
                System.out.println("Very Good Score");}
        if (counter <= 3){
                    System.out.println("Time to brush up on your knowledge of global warming");}
        }



    public static void main(String[] args) {
        GlobalWarmingFactsQuiz quizes = new GlobalWarmingFactsQuiz();
        quizes.get_questions();
        quizes.provide_answers();
    }

}
