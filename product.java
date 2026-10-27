public class product {
    public static void main(String[] args) {
        String name = "Laptop";
        double price = 45000.00;
        int quantity = 2;
        double total = price * quantity;

        System.out.println("Product: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);

        if (total > 50000) {
            System.out.println("Discount applied");
        } else {
            System.out.println("No discount");
        }
    }
}
