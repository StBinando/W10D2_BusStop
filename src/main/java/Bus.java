import java.util.ArrayList;


public class Bus {
    private String destination;
    private int capacity;
    private ArrayList<Passenger> passengersList;


    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengersList = new ArrayList<Passenger>();
    }

    public int getNumberOfPassengers() {
        return passengersList.size();
    }

    public void addPassenger(Passenger passenger) {
        if(getNumberOfPassengers() < capacity) {
            passengersList.add(passenger);
        }
    }

    public void removePassenger() {
        if(getNumberOfPassengers()>0){
            passengersList.remove(0);
        }
    }

    public void pickUp(BusStop busStop) {
        if (getNumberOfPassengers()<capacity){
            passengersList.add(busStop.removePassengerFromQueue());
        }
    }
}
