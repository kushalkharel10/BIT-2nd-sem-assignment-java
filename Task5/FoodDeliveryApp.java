public class FoodDeliveryApp {
    public static void main(String[] args) {
        // Singleton Demo
        DatabaseManager db = DatabaseManager.getInstance();
        db.logActivity("Fetching user data");
        
        // Factory Demo
        UserFactory factory = new UserFactory();
        User customer = factory.createUser("customer", "Alice");
        System.out.println("Created user: " + customer.getUserId());
        
        // Observer Demo
        OrderTracker orderSystem = new OrderTracker();
        orderSystem.addObserver((OrderObserver) customer);
        orderSystem.setStatus("ORDER_PREPARING");
    }
}
