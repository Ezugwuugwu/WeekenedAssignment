package ChapterSix;

import java.util.Scanner;

public class RoundingNumbers {
    int radius;
    Scanner input = new Scanner(System.in);
    public  void get_Input(){
        System.out.println("Enter the radius to calculate the area and the circumference of a circle");
        radius = input.nextInt();
    }

    public double get_Circumference_Of_Circle(){
        double circumference = 2 * Math.PI * radius;

        return circumference;
    }

    public double get_Area_Of_Cirlce(){
        double area = Math.PI * Math.pow(radius, 2);

        return area;
    }

    public double get_Rounded_Circumference(){
        double roundedCircumference = Math.floor(get_Circumference_Of_Circle());

        return roundedCircumference;
    }
    public double get_Rounded_Area(){
        double roundedArea = Math.floor(get_Area_Of_Cirlce());

        return roundedArea;
    }

    public void print_Result(){
        System.out.printf("%s %s", "Circumference","Area\n");
        System.out.printf("%.2f %13.2f", get_Circumference_Of_Circle(), get_Area_Of_Cirlce());
        System.out.println();
        System.out.printf("Rounded Values:\n");
        System.out.printf("%.2f %13.2f", get_Rounded_Circumference(), get_Rounded_Area());
    }

    public static void main(String[] args) {
        RoundingNumbers round = new RoundingNumbers();
        round.get_Input();
        round.print_Result();
    }

}
