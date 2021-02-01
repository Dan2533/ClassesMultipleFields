package com.Danielle;

/* Instance fields
   Add two new instance fields for Store.
   InventoryCount of type int.
   InventoryPrice of type double.
 */

public class Store {
    String productType;
    int inventoryCount;
    double inventoryPrice;

/* Constructor method
   In the body of the Store constructor, assign the parameter values to the appropriate instance fields.
   Update the Store constructor method with the new parameters.
   The parameters should be product, count, and price, in that order.
*/
    public Store(String product, int count, double price) {
        productType = product;
        inventoryCount = count;
        inventoryPrice = price;
    }

    // main method
    public static void main(String[] args) {
        Store cookieShop = new Store("cookies", 12, 3.75);
    }
}

