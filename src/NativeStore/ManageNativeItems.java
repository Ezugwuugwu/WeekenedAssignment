package NativeStore;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageNativeItems {

    ArrayList<ItemsInNative> itemInformation = new ArrayList<ItemsInNative>();
    Scanner input = new Scanner(System.in);

    public void captureItemInformation(){
        ItemsInNative nativeItems = new ItemsInNative();

        System.out.println("What did he buy");
       String itemName = input.next();
        input.nextLine();

        System.out.println("Enter quantity of items");
        int itemQuantity = input.nextInt();

        System.out.println("Enter the amount for item");
        double itemAmount = input.nextDouble();

        nativeItems.setItemName(itemName);
        nativeItems.setItemQuantity(itemQuantity);
        nativeItems.setItemAmount(itemAmount);
        itemInformation.add(nativeItems);
    }


    public void getAllItemsPurchased(){
        System.out.println("Native Store Invoice for items purchase");
        System.out.println("Item Name:    Item Quantity:    Item Amount:    Amount to pay");
        System.out.println();
        for (ItemsInNative natives : itemInformation){
            System.out.printf("%s%13d%20.2f%22.2f",natives.getItemName(),
                    natives.getItemQuantity(),natives.getItemAmount(),natives.getTotalAmountForItem());
            System.out.println();
        }
    }
    public void getSumOfAllItemsPurchased(){
        double sum =0;
        for (ItemsInNative sumTotal : itemInformation){
            sum = sum + sumTotal.getTotalAmountForItem();
        }
        System.out.println();
        System.out.println("Total of all items purchased is "+sum);
    }
}
