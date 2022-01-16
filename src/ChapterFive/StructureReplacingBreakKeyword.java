package ChapterFive;

public class StructureReplacingBreakKeyword {
    public  void break_Statement(){
        int counter =0;
           for (counter =1; counter <=10; counter++){
               if (counter ==5){
                   return;// structure equivalent of break keyword
               }
               System.out.println(counter);
           }
    }

    public static void main(String[] args) {
        StructureReplacingBreakKeyword breakPoint = new StructureReplacingBreakKeyword();
        breakPoint.break_Statement();
    }
}
