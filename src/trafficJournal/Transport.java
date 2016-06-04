package trafficJournal;

/**
 * Created on 20.05.2016.
 *
 * super class to all vehicles
 */

public abstract class Transport {

    /**
     * parameters of vehicles
     * @return
     */
    public abstract String model();
    public abstract String number();

    @Override
    public String toString(){
        return "Model of vehicle is : " + model() + ", and the number is: " + number() + '\'';
    }

    @Override
    public boolean equals(Object obj){

        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Transport temp = (Transport) obj;
        return (temp.number() == this.number()) && (temp.model() == this.model());
    }
}