public class dashboard {
    public static void main(String[] args) {
        int sales = 2500;
        int target = 40000;
        int employees = 12;
        String status = (sales >= target) ? "Goal achieved" : "Below target";

        System.out.println("Monthly Sales: " + sales);
        System.out.println("Target: " + target);
        System.out.println("Employees: " + employees);
        System.out.println("Status: " + status);

        if (sales >= target) {
            System.out.println("Performance: Excellent");
        } else {
            System.out.println("Performance: Needs improvement");
        }

        System.out.println("Average sales per employee: " + (sales / employees));
    }
}
