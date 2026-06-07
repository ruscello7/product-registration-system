public class Product {
    String name;        // Product name
    double price;       // Product price
    int quantity;       // Product quantity in stock

Product(String name, double price, int quantity) {      // Constructor - builds the object with real values
    this.name = name;       // "this" refers to this object's attribute
    this.price = price;     // assigns the received value to this object's price
    this.quantity = quantity;       // assigns the received value to this object's quantity
    }
}