package bikePackage;

import java.util.Scanner;

public class BikeMainClass {
    public static void main(String[] args) {
        do {
            turnOnBike();
            print("u are on speed "+BikeClass.accelerate_GearOne_Speed());
        }while (true);



    }


    public static void print(String output){
        System.out.println(output);
    }

    public static void turnOnBike(){
        Scanner scanner = new Scanner(System.in);
        String powerKey = "Press 1 to power Bike";
        print(powerKey);
        int powerButton = scanner.nextInt();
        switch (powerButton){
            case 1:
                if (powerButton ==1)
                    BikeClass.turn_On_Bike();
                if (BikeClass.bike_Is_On ==true){
//                    print("Your Bike is On");
                }else
                    break;
        }


    }




}
