public class UserFactory {
    public User createUser(String type, String id) {
        if ("customer".equalsIgnoreCase(type)) 
            return new Customer(id);
        throw new IllegalArgumentException("Invalid user type");
    }
}
