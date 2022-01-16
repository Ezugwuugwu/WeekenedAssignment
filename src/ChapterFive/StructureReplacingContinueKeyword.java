package ChapterFive;

public class StructureReplacingContinueKeyword {

    public void continue_Statement(){
        for (int counter =1; counter <=10; counter++){
            if (counter == 5){
                counter++;// integer five skipped
            }
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {
        StructureReplacingContinueKeyword continueKeyword = new StructureReplacingContinueKeyword();
        continueKeyword.continue_Statement();
    }
}
