package trafficJournal;

/**
 * Created on 20.05.2016.
 *
 * class of motorcycles
 */

public class Motorcycle extends Transport {

    /**
     * general features of creating motorcycles
     */
    private String model;
    private String number;

    /**
     * constructor of motorcycle
     * @param model
     * @param number
     */
    public Motorcycle(String model, String number){
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
        return "Model of motorcycle is : " + model + ", and the number is: " + number;
    }
}
