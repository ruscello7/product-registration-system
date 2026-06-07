public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Screw", 0.99, 100);       // Creates a new product
        System.out.println(p1.name);        // prints the product name
        System.out.println(p1.price);       // prints the product price
        System.out.println(p1.quantity);        // prints the product quantity

    }
}