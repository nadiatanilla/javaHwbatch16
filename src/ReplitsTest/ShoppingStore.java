package ReplitsTest;

public class ShoppingStore {
    String item;
    double price;
    double quantity;

    ShoppingStore(String item, double price, int quantity) {
        this.item = item;
        this.price = price;
        this.quantity = quantity;
    }


    void itemTotalPrice() {
        double totalvalue1 = price * quantity;
        System.out.println(item + " Total Value " + totalvalue1);
    }


    public static void main(String[] args) {
        ShoppingStore obj = new ShoppingStore("Blanket", 49.99, 2);
        ShoppingStore obj1 = new ShoppingStore("Mattress", 219.59, 2);

        obj.itemTotalPrice();
        obj1.itemTotalPrice();


    }

}

