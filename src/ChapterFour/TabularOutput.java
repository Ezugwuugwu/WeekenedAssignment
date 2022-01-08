package ChapterFour;

public class TabularOutput {
    public void _10tabular_Output(){
        int i;
        int resultOne =0;
        int resultTwo =0;
        int resultThree =0;
        System.out.printf("%S  %S  %S  %S" , "n","n*10", "n*100", "n*1000");
        System.out.println();

        for (i =1; i <= 5; i++){
            resultOne = i * 10;
            resultTwo = i * 100;
            resultThree = i * 1000;
            System.out.printf("%d%4d%7d%9d", i, resultOne,resultTwo,resultThree);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TabularOutput output = new TabularOutput();
        output._10tabular_Output();
    }
}
