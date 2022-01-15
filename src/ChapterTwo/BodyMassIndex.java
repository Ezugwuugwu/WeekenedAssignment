package ChapterTwo;

import java.util.Scanner;

public class BodyMassIndex {
    Scanner input = new Scanner(System.in);
    double weight;
    double height;

    public void _BMI_Basic_Info(){
        String format = """
                BMI VALUES:
                Underweight: less than 18.5
                Normal: between 18.5 and 24.9
                Overweight: between 25 and 29.9
                Obese: 30 or greater
                """;
        System.out.println(format);
    }

    public void collect_Input(){
        System.out.println("Enter your weight in pounds");
        weight = input.nextInt();
        System.out.println("Enter your height in inches");
        height = input.nextInt();
    }

    public double calculate_Body_Mass_Index(){
        double BMI = (weight * 703)/Math.pow(height,height);
        return BMI;
    }

    public static void main(String[] args) {
        BodyMassIndex index = new BodyMassIndex();
        index.collect_Input();
        System.out.println("Your body mass index is "+index.calculate_Body_Mass_Index());
        System.out.println();
        index._BMI_Basic_Info();
    }
}
