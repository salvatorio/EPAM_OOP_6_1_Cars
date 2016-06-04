package trafficJournal;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created on 20.05.2016.
 *
 * class of crossway
 */

public class Crossway {

    private ArrayList<Transport> vehicles = new ArrayList<>();

    public ArrayList<Transport> getVehicles() {
        return vehicles;
    }

    /**
     * add a new vehicle to the list of vehicles, that moved through the crossway
     * @param transport
     */
    public void addTransport(Transport transport){
        vehicles.add(transport);
    }

    /**
     * counts the total number of vehicles, that moved through the crossway
     */
    public int quantityOfTransport(){
        return vehicles.size();
    }

    /**
     * counts the number of trucks, that moved through the crossway
     * @return
     */
    public int quantityOfCrossedTrucks(){
        int counter = 0;
        for (Transport transport: vehicles){
            if (transport instanceof Truck){
                counter++;
                System.out.println(transport.toString());
            }
        }
        return counter;
    }

    /**
     * counts the total number of cars, that moved through the crossway
     * @return
     */
    public int quantityOfCrossedCars(){
        int counter = 0;
        for (Transport transport: vehicles){
            if (transport instanceof Car){
                counter++;
                System.out.println(transport.toString());
            }
        }
        return counter;
    }

    /**
     * counts the total number of motorcycles, that moved through the crossway
     * @return
     */
    public int quantityOfCrossedMotorcycle(){
        int counter = 0;
        for (Transport transport: vehicles){
            if (transport instanceof Motorcycle){
                counter++;
                System.out.println(transport.toString());
            }
        }
        return counter;
    }

    /**
     * searching the spesial vehicle in list with the known model and number
     * @param vehicleType
     * @param model
     * @param number
     * @return
     */
    public boolean findTransport(Class vehicleType, String model, String number) {

        Iterator<Transport> itr = vehicles.iterator();
        while (itr.hasNext()) {
            Transport element = itr.next();
            if ((element.getClass() == vehicleType) &
                    (element.number().equals(number)) &
                    (element.model().equals(model))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return " \nThe quantity of crossed vehicles : " + quantityOfTransport() +
                " \namong them trucks are : " + quantityOfCrossedTrucks() +
                " \ncars are : " + quantityOfCrossedCars() +
                " \nmotorcycles are : " + quantityOfCrossedMotorcycle();
    }
}
