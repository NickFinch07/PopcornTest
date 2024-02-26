public class PopcornOrder {

    private String variety;
    private int numOrdered;

    public PopcornOrder(String initVariety, int initNumOrdered) {
        variety = initVariety;
        numOrdered = initNumOrdered;
    }

    public String getVariety() {
        return variety;
    }

    public int getNumOrdered() {
        return numOrdered;
    }

    public String toString() {
        if (numOrdered != 0) {
            return ("Variety :" + variety + " Number Ordered: " + numOrdered);
        }
        else {
            return ("There are no orders.");
        }
    }

} 