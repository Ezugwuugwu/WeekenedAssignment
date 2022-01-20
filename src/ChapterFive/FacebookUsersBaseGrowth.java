package ChapterFive;

public class FacebookUsersBaseGrowth {

    public static void main(String[] args) {
        final double rate = 0.04;
        double userGrowth = 1000000000;
        double mothly_growth = userGrowth * rate;
        int counter =0;

        for (int month =1; month <=30; month++){
            userGrowth = userGrowth +mothly_growth;
            System.out.printf("%d%20.2f", month, userGrowth);
            counter++;
            System.out.println();

            if (userGrowth >= 1500000000 && userGrowth <1530000000){
                System.out.println("At "+month+"th month, the users will be upto 1.5billion");}

            if (userGrowth == 2000000000){
                System.out.println("At "+month+"th month, the users will be upto 2billion");
            }
        }

    }
}
