public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Screw", 0.99, 100);       // Creates a new product
        System.out.println(p1.name);        // prints the product name
        System.out.println(p1.price);       // prints the product price
        System.out.println(p1.quantity);        // prints the product quantity

        Product p2 = new Product("Tape", 6.99, 25);     // Create a second product
        System.out.println(p2.name);        // prints the second product name
        System.out.println(p2.price);       // prints the second product price
        System.out.println(p2.quantity);    // prints the second product quantity

        Product p3 = new Product("Alcohol", 9.99, 10);      // Create a third product
        System.out.println(p3.name);        // prints the third product name
        System.out.println(p3.price);       // prints the third product price
        System.out.println(p3.quantity);    // prints the third product quantity

    }
}