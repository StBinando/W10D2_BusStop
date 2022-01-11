import java.util.ArrayList;

public class BusStop {
    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name) {
        this.name = name;
        this.queue = new ArrayList<Passenger>();
    }

    public int getQueueSize() {
        return queue.size();
    }

    public void addPassengerToQueue(Passenger passenger) {
        queue.add(passenger);
    }

    public Passenger removePassengerFromQueue() {
        return queue.remove(0);
    }
}
