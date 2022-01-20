package ChapterSix;

import java.util.Scanner;

public class StudentsAveragePoint {

    public static void main(String[] args) {
        StudentsAveragePoint average = new StudentsAveragePoint();
      average.input_Average_Score();
    }

    public void input_Average_Score() {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter your average score");
            int average = input.nextInt();
            int result =  quality_points(average);
            System.out.println("Your quality point is "+result);
        }while (true);

    }

    public int quality_points(int averageScore) {
        if (averageScore >= 90 && averageScore <= 100) {
            return 4;
        } else {
            if (averageScore >= 80 && averageScore <= 89) {
                return 3;
            } else {
                if (averageScore >= 70 && averageScore <= 79) {
                    return 2;
                } else {
                    if (averageScore >= 60 && averageScore <= 69) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
