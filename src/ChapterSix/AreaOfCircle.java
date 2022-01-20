package ChapterSix;

import java.util.Scanner;

public class AreaOfCircle {
    Scanner input = new Scanner(System.in);

    public double circle_area(int radius){
        double area = Math.PI * Math.pow(radius,2);

        return area;
    }

    public void input_Radius(){
        System.out.println("Enter radius to calculate the area");
        int radius = input.nextInt();
        double area = circle_area(radius);
        double roundArea = Math.floor(100 * area)/100;
        System.out.println("Area of the circle is "+ roundArea);
    }

    public static void main(String[] args) {
        AreaOfCircle area = new AreaOfCircle();
        area.input_Radius();
    }
}
