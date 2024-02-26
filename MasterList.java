import java.util.*;
public class MasterList {

    private ArrayList<PopcornOrder> orders;

    public MasterList() {
        orders = new ArrayList<PopcornOrder>();
    }

    public void addOrder(String food, int value) {
        PopcornOrder newOrder = new PopcornOrder(food, value);
        orders.add(newOrder);
    }

    public int getTotalOrders() {
        int total = 0;
        for (int i = 0; i < orders.size(); i++) {
            total += orders.get(i).getNumOrdered();
        }
        return total;
    }

    public int removeVariety(String keyword) {
        int total = 0;
        for (int i = orders.size() - 1; i > 0; i--) {
            if (orders.get(i).getVariety().equals(keyword)) {
                total += orders.get(i).getNumOrdered();
                orders.remove(i);
            }
        }
        return total;
    }
    // Continued on next page

    public String toString() {
        return orders.toString();
    }
    
}   // end class
 