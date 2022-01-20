package ChapterFive;

import java.util.Scanner;

public class CalculatingSales {
    Scanner input = new Scanner(System.in);
    private final double product1 = 2.98;
    private final double product2 = 4.50;
    private final double product3 = 9.98;
    private final double product4 = 4.49;
    private final double product5 = 6.87;
  static   double totalRetailValue;


    public void availableProducts(){
while (true){
    String format = """
                1 to add milk - $2.98
                2 to add Bread - $4.50
                3 to add Sugar -$9.98
                4 to add water - $4.49
                5 to add chocolate - $6.87
                6 to exit the program
                
                Select item number to add it to cart
                """;
    System.out.println(format);
        int userInput = input.nextInt();
        if (userInput == 6){
        System.exit(6);
    }
    System.out.println("Enter the quantity to buy");
        int quantity = input.nextInt();

    switch (userInput){

        case 1: totalRetailValue =  quantity * product1; break;

        case 2: totalRetailValue  = quantity * product2; break;

        case 3: totalRetailValue = quantity * product3; break;

        case 4: totalRetailValue = quantity * product4; break;

        case 5: totalRetailValue = quantity * product5;break;
    }
    System.out.println("The total valued retail is "+totalRetailValue);
}
    }

    public static void main(String[] args) {
        CalculatingSales sales = new CalculatingSales();
        sales.availableProducts();
    }
}
