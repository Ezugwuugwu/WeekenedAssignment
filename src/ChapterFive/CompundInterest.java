package ChapterFive;

public class CompundInterest {

    double five_Percent_Interest_Rate = 0.05;
    double six_Percent_Interest_Rate = 0.06;
    double seven_Percent_Interest_Rate = 0.07;
    double eight_Percent_Interest_Rate = 0.08;
    double nine_Percent_Interest_Rate = 0.09;
    double ten_Percent_Interest_Rate = 0.1;
    double investedAmount = 1000.0;
    int numberOfYears;

    public void interest_For_10_Years(){
        System.out.printf("%s  %5s  %5s  %6s  %6s  %6s  %6s", "Year", "5% interest","6% interest",
                "7% interest", "8% interest", "9% interest", "10% interest \n" );


        for (numberOfYears = 1; numberOfYears <=10; numberOfYears++){
            double fiveYearsAmount = investedAmount * Math.pow(1+five_Percent_Interest_Rate,numberOfYears);
            double sixYearsAmount = investedAmount * Math.pow(1+ six_Percent_Interest_Rate,numberOfYears);
            double sevenYearsAmount = investedAmount * Math.pow(1+ seven_Percent_Interest_Rate,numberOfYears);
            double eightYearsAmount = investedAmount * Math.pow(1+ eight_Percent_Interest_Rate,numberOfYears);
            double nineYearsAmount = investedAmount * Math.pow(1+ nine_Percent_Interest_Rate,numberOfYears);
            double tenYearsAmount = investedAmount * Math.pow(1+ ten_Percent_Interest_Rate,numberOfYears);

            System.out.printf("%d %12.2f %12.2f %12.2f %12.2f %12.2f %12.2f", numberOfYears, fiveYearsAmount,
                    sixYearsAmount, sevenYearsAmount,eightYearsAmount, nineYearsAmount, tenYearsAmount);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CompundInterest interest = new CompundInterest();
        interest.interest_For_10_Years();
    }
}
