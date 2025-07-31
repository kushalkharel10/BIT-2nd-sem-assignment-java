public class Customer implements User, OrderObserver {
    private final String userId;
    
    public Customer(String name) {
        this.userId = "CUST-" + name.toUpperCase();
    }
    
    @Override
    public String getUserId() {
        return userId;
    }
    
    @Override
    public String getUserType() {
        return "CUSTOMER";
    }
    
    @Override
    public void update(String status) {
        System.out.println("Customer " + userId + " notified: " + status);
    }
}
