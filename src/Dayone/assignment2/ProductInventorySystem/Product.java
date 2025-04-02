package Dayone.assignment2.ProductInventorySystem;

// Manage a product inventory with details and stock levels
public class Product {
    // variables
    String productName;
    double price;
    int stock;

    Product(){

    }

    Product(String productName, double price, int stock) {
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }



    void updateStock(int quantity) {
        if(this.stock <= 10){
            // update the stock level by adding the quantity.
            this.stock += quantity;
            System.out.println("Stock updated Successfully: " + this.stock);
        }else {
            System.out.println("Product sold out successfully");
        }
    }


    void sellProduct( int quantity) {
        if(quantity < this.stock) {
            // update the stock level by reducing the quantity
            this.stock -= quantity;
        }else {
            System.out.println("Oops! ... Sorry, not enough stock, to sell at the moment.");
        }

    }

    //printing the product details including the stock level
    void printProductDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: " + this.price);
        System.out.println("Stock: " + this.stock);
    }


    public static void main(String[] args) {
        // Initialize
        Product product = new Product("Black Njahi", 500, 0);
        product.updateStock(20);
        product.sellProduct(10);
        product.printProductDetails();

    }

}
