import java.util.ArrayList;
import java.util.List;

public class OrderTracker {
    private List<OrderObserver> observers = new ArrayList<>();
    public void addObserver(OrderObserver o) {
        observers.add(o);
    }
    public void setStatus(String status) {
        observers.forEach(observer -> observer.update(status));
    }
}
