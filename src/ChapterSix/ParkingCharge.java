package ChapterSix;

import java.util.List;
import java.util.Scanner;

public class ParkingCharge {
    int parkingTime;
    double charge_After24Hours = 10.00;
    double minimumAmountForMinimumHours = 2.0;
    double extraChargeForExtraHours = 0.5;
    double total = 0;
    String name;
    Scanner input = new Scanner(System.in);

    public void get_Parking_information() {
        while (parkingTime != -2) {
            System.out.println("Enter your name");
            name = input.nextLine();
            input.nextLine();
            System.out.println("Enter number of hours you parked at the parking lot OR -2 to end the program");
            parkingTime = input.nextInt();


            if (parkingTime <=24){
                if (parkingTime ==24){
                    total = total +charge_After24Hours;
//                    System.out.println(charge_After24Hours);
                }
                if (parkingTime ==3){
                    total = total + minimumAmountForMinimumHours;
//                    System.out.println(minimumamountForMinimumHours);
                }
                if (parkingTime > 3){
                    double charge = minimumAmountForMinimumHours + (parkingTime -3)*extraChargeForExtraHours;
                    total = total + charge;
//                   System.out.println(charge);
                }
            }else {
                System.out.println("Wrong parking time");
            }
        }
        System.out.println("Total is "+total);
        System.out.println(name);
    }


    public static void main (String[]args){
        ParkingCharge charge = new ParkingCharge();
        charge.get_Parking_information();
    }
}

