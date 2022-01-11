import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BusTest {
    private Bus bus;
    private Passenger passenger1;
    private BusStop busStop;

    @Before
    public void before() {
        bus = new Bus("Ocean Terminal", 1);
        passenger1 = new Passenger();
        busStop = new BusStop("Codeclan");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(passenger1);
        assertEquals(1, bus.getNumberOfPassengers());
        bus.addPassenger(passenger1);
        assertEquals(1, bus.getNumberOfPassengers());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPassenger(passenger1);
        bus.removePassenger();
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void canPickUpFromBusStop(){
        busStop.addPassengerToQueue(passenger1);
        busStop.addPassengerToQueue(passenger1);
        bus.pickUp(busStop);
        bus.pickUp(busStop);
        assertEquals(1, busStop.getQueueSize());
        assertEquals(1, bus.getNumberOfPassengers());

    }
}

