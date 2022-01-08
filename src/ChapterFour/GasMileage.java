package ChapterFour;

import java.util.Scanner;

public class GasMileage {
    static Scanner input = new Scanner(System.in);
    private static int totalMileage =0, totalGallons =0, mileage = 0, numberOfGallonsUsed =0, counter;
    private static double totalMiles =0, miles;

    public static void RecordMileageAndGallons(){
        while (mileage != -5 || numberOfGallonsUsed != -5 ){
            totalMileage = totalMileage + mileage;
            counter = counter + 1;

            totalGallons = totalGallons + numberOfGallonsUsed;
            counter = counter + 1;

            System.out.print("what was the trip's mileage: ");
            mileage = input.nextInt();
            System.out.print("Number of gallons used: ");
            numberOfGallonsUsed = input.nextInt();


            System.out.println("Mileage: "+mileage);
            System.out.println("Gallons: "+numberOfGallonsUsed);


            miles = (double) mileage/numberOfGallonsUsed;
            System.out.println("Miles covered for this trip: "+miles);
            totalMiles =  totalMiles + miles;
        }
        System.out.println("Total miles covered for all the trips: "+(totalMiles-1));
    }


    public static void main(String[] args) {
        System.out.println("\nEnter -5 for both mileage and gallon to terminate\n");
       RecordMileageAndGallons();

    }
}
