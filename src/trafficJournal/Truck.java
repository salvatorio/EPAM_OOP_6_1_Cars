package trafficJournal;

/**
 * Created on 20.05.2016.
 *
 * class of trucks
 */

public class Truck extends Transport {

    /**
     * general features of creating trucks
     */
    private String model;
    private String number;

    /**
     * constructor of truck
     * @param model
     * @param number
     */
    public Truck(String model, String number) {
        this.model = model;
        this.number = number;
    }

    @Override
    public String model() {
        return model;
    }

    @Override
    public String number() {
        return number;
    }

    @Override
    public String toString() {
        return "Model of truck is : " + model + ", and the number is: " + number;
    }
}
