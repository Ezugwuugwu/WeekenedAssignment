package ChapterFour;

import java.util.Scanner;

public class SalesCommissionCalculator {
    Scanner input = new Scanner(System.in);
    private static double item_Value, totalItems =0, counter =0;
    private final int SALARY =200;


    public void add_Items_And_Values(){
        while (item_Value != -2){
            totalItems = totalItems + item_Value;
            counter = counter + 1;
            System.out.print("Enter the value of item sold ");
            item_Value = input.nextDouble();
        }
        System.out.println("\nTotal value of item(s) sold: "+ totalItems);
    }


    public static double check_SalePerson_Bonus(){
        double bonus = 0.09 * totalItems;
        return bonus;
    }


    public double sale_Person_Total_Easrning(){
           double dav=0;
           dav = check_SalePerson_Bonus() + SALARY;
           return dav;
    }
    public static void main(String[] args) {
        SalesCommissionCalculator saleCommision = new SalesCommissionCalculator();
        System.out.println("\nEnter -2 to calculate transactions\n");
        saleCommision.add_Items_And_Values();
        System.out.println("Bonus for item(s) sold: "+check_SalePerson_Bonus());
        System.out.println("Sale Person's total earning: "+saleCommision.sale_Person_Total_Easrning());
    }
}
