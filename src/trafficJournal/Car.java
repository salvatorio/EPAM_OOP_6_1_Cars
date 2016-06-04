package trafficJournal;

/**
 * Created on 20.05.2016.
 *
 * class of cars
 */

public class Car extends Transport {

    /**
     * general features of creating cars
     */
    private String model;
    private String number;

    /**
     * constructor of car
     * @param model
     * @param number
     */
    public Car(String model, String number) {
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
        return "Model of car is : " + model + ", and the number is: " + number;
    }
}
