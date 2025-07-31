/**
 * Main class demonstrating all 3 design patterns
 * for Online Food Delivery App (Task 5)
 */
public class Main {
    public static void main(String[] args) {
        // 1. Singleton Demo
        DatabaseManager db = DatabaseManager.getInstance();
        db.logActivity("Fetching menu data");

        // 2. Factory Demo
        UserFactory factory = new UserFactory();
        User customer = factory.createUser("customer", "Alice123");
        System.out.println("Created: " + customer.getUserId());

        // 3. Observer Demo
        OrderTracker order = new OrderTracker();
        order.addObserver((OrderObserver) customer);
        order.setStatus("PREPARING");
    }
}
