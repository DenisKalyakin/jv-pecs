package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {
    private int weight;
    private int value;
    public Truck() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

    ////////////////////////// delete toString ////////////////

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", value=" + value +
                '}';
    }
}


