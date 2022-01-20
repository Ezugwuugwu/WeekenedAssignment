package ChapterFive;

import java.util.Scanner;

public class FairTaxRate {
   private double total =0;
   private final double taxRate = 0.3;

    public void register_expenses(){
        Scanner input = new Scanner(System.in);
        double expenses =0;
        System.out.println("\nNote: To end the program, enter dummy value of -1".toUpperCase());

        while (expenses != -1 ){
            System.out.println("Expense category");
            String category = input.nextLine();
            input.nextLine();
            System.out.println("Amount spent");
            expenses = input.nextInt();
            if (expenses ==-1)
                return;
            total = total + expenses;
        }
    }

    public double get_My_Fair_Tax(){
        double totalFairTax = taxRate * total;
        return totalFairTax;
    }

    public static void main(String[] args) {
        FairTaxRate tax = new FairTaxRate();
        tax.register_expenses();
        System.out.println("Total estimated fair tax on my expenses: "+tax.get_My_Fair_Tax());
    }
}
