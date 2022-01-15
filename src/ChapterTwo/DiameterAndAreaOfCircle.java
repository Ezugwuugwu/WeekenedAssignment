package ChapterTwo;

import java.util.Scanner;

public class DiameterAndAreaOfCircle {
    int radius;
    Scanner input = new Scanner(System.in);

    public void input_Radius(){
        System.out.println("To calculate the diamter, area and circumference of a circle");
        System.out.println("Enter the radious of a circle");
        radius = input.nextInt();
    }

    public  double diameter_Of_Circle(){

     return (2 * radius);
    }

    public double circumference_Of_circle(){
        return 2 * Math.PI *radius;
    }

    public double area_Of_Circle(){
       return Math.PI * Math.pow(radius,2);
    }

    public static void main(String[] args) {

        DiameterAndAreaOfCircle circleCalc = new DiameterAndAreaOfCircle();
       circleCalc.input_Radius();
        System.out.printf("%s%8s%12s ", "Diamter", "Circum", "Area");
        System.out.println();
        System.out.printf("%s%10.2f %14.2f", circleCalc.diameter_Of_Circle(), circleCalc.circumference_Of_circle(),circleCalc.area_Of_Circle());

    }
}
