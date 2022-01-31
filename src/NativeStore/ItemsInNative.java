package NativeStore;

public class ItemsInNative {
    String itemName;
    int itemQuantity;
    double itemAmount;
    double totalAmountForItem;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public double getTotalAmountForItem() {
        totalAmountForItem = itemAmount *itemQuantity;
        return totalAmountForItem;
    }

}
