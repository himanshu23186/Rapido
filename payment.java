public class payment {
    public static void main(String[] args) {
        int amount = 5000;
        int discount = 500;
        int paid = 4500;
        int finalAmount = amount - discount;

        System.out.println("Bill Amount: " + amount);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + finalAmount);
        System.out.println("Paid Amount: " + paid);

        if (paid >= finalAmount) {
            System.out.println("Payment successful");
        } else {
            System.out.println("Payment failed");
        }
    }
}
