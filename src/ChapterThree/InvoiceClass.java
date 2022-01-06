package ChapterThree;

public class InvoiceClass {
    private String partNumber;
    private String partDescription;
    private  int itemQuantity;
    private double pricePerItem;

    public InvoiceClass(String partNumber, String partDescription, int itemQuantity, double pricePerItem){
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getItemQuantity() {

        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount( ){
        double amount = itemQuantity * pricePerItem;
        if (itemQuantity < 0)return 0;
        if (pricePerItem < 0) return 0.0;

        return  amount;
    }


    public static void main(String[] args) {
        InvoiceClass invoice = new InvoiceClass("H2H03","Milk", 3, 5.0);
        System.out.println("Invoice from the All args constructor:");
        System.out.println("Part Number: "+invoice.getPartNumber()+"\nPart Description: "+invoice.getPartDescription());
        System.out.println("quantity of items purchased: "+invoice.itemQuantity+"\nPrice per item: "+invoice.pricePerItem);
        System.out.println("\nTotal ampount for all items: "+invoice.getInvoiceAmount());


        System.out.println("\n\nAmount to be paid when the amount and or the quantity of items is less than zero");
        invoice.setItemQuantity(-2);
        invoice.setPricePerItem(-34.0);
        System.out.println("Quantity of items: "+invoice.getItemQuantity()+"\nPrice per item is: "+invoice.getPricePerItem());
        System.out.println("Total amount to be paid:  "+invoice.getInvoiceAmount());
    }
}
