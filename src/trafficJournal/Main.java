package trafficJournal;

/**
 * Created on 20.05.2016.
 *
 * Main class
 */

public class Main {

    public static void main(String[] args) {

        /**
         * creating instance of crossway
         */
        Crossway crossway = new Crossway();

        /**
         * creating instances of vehicles, that moving the crossway
         */
        crossway.addTransport(new Motorcycle("HARLEY DAVIDSON", "1236985"));
        crossway.addTransport(new Truck("CITROEN", "AA 1233 BC"));
        crossway.addTransport(new Truck("MERCEDES", "UA 9090 UA"));
        crossway.addTransport(new Car("PORSCHE", "1"));
        crossway.addTransport(new Motorcycle("YAMAHA", "CA23434B"));
        crossway.addTransport(new Motorcycle("JAVA", "EPAM"));

        System.out.println(crossway);

        System.out.println("Did the motorcycle YAMAHA with the number CA23434B moved through this crossway? - "
                            + crossway.findTransport(Motorcycle.class, "YAMAHA", "CA23434B"));
    }
}
