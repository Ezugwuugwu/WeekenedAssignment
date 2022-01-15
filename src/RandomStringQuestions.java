import java.util.*;

public class RandomStringQuestions {
  static  List<String> questions = new ArrayList<>();
  static List<String> listOfAnswers = new ArrayList<>();
  static   String [] questionArray = questions.toArray(new String[questions.size()]);
  static  Random rand = new Random();


  public static void main(String[] args) {
      list_Of_Questions();
      list_Of_Answers();
      display_Answers();
    }

    public static void list_Of_Questions() {
      System.out.println("\n");
      questions.add("1. What is Buhari's state");
      questions.add("2. what is the capital of Nigeria");
      questions.add("3. What is the capital of Ghana");
      questions.add("4. How many regions does Nigeria have");
      questions.add("5. How many states are in South West Nigeria");
      questions.add("6. How many states are in South South Nigeria");
      questions.add("7. How many states are in North Central Nigeria");
      questions.add("8. Where is United Nation located");
      questions.add("9. Which club do you support in England");
      questions.add("10. How many states are in South East Nigeria");
      int i;
      String convertedString ="";
        for (i =0; i < questions.size(); i++){
            displayQuestions(questions);
            System.out.println();
        }
    }

    public static void list_Of_Answers(){
        System.out.println("\n");
        listOfAnswers.add("Buhari's state is Katsina ");
        listOfAnswers.add("Capital of Nigeria is Abuja");
        listOfAnswers.add("The capital of Ghana is Acrra");
        listOfAnswers.add("Nigeria has 6 resgions");
        listOfAnswers.add("There are 6 states in south West Nigeria");
        listOfAnswers.add("There are 6 states in South South Nigeira");
        listOfAnswers.add("There are 6 states in North Centra");
        listOfAnswers.add("The headquaters of United Nation is in Belgium");
        listOfAnswers.add("CHelsea club ");
        listOfAnswers.add("There are 5 states in South East Nigeria");

      for (int i =0; i < listOfAnswers.size(); i++){
        displayQuestions(listOfAnswers);
          System.out.println();
      }
    }

    public static void display_Answers(){
        List<String> answer = new ArrayList<>();
        List<String> que = new ArrayList<>();
        String convertedQuestionString = "";
        String convertedListOfAnswers ="";

        for (String s: listOfAnswers){
            convertedListOfAnswers = convertedListOfAnswers + s + " ";
            answer.add(convertedListOfAnswers);
            for (String x : questions){
                convertedQuestionString = convertedQuestionString +x +"\n";
            }
            que.add(convertedQuestionString);
        }
    }

    public static void displayQuestions(List<String> questions){
      try {
          List<String> newQuestions = new Stack<String>();
          String string = questions.toString();
          newQuestions.add(string);

          int indexNumber = rand.nextInt(questions.size());
          System.out.println(questions.get(indexNumber));
          questions.remove(indexNumber);
try {


    if (rand.nextInt(questions.size()) == indexNumber){
        System.out.println(listOfAnswers.get(0));

        if (rand.nextInt(questions.size())==Character.getNumericValue(questions.size())){
            System.out.println(listOfAnswers.get(1));
        }

    }
}catch (IllegalArgumentException jack){

}
      }catch (IndexOutOfBoundsException theException){
      }
    }
}
