import java.util.*;
public class MasterList {

    private ArrayList<PopcornOrder> orders;

    public MasterList() {
        orders = new ArrayList<PopcornOrder>();
    }

    public void addOrder(PopcornOrder newOrder) {
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
        for (int i = orders.size(); i > 0; i--) {
            if (orders.get(i).getVariety().equals(keyword)) {
                total += orders.get(i).getNumOrdered();
                orders.remove(i);
            }
        }
        return total;
    }
    // Continued on next page

    public String toString() {
        String temp = "";
        if (orders.size() != 0) {
            for (int i = 0; i < orders.size(); i++) {
                temp += orders.get(i) + ", ";
            }
        }
        else {
            return "There are no orders.";
        }
    }
    
}   // end class
 