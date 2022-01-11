import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BusStopTest {
    private BusStop busStop;
    private Passenger passenger1;

    @Before
    public void before(){
        busStop = new BusStop("CodeClan");
        passenger1 = new Passenger();
    }

    @Test
    public void busStopStartsEmpty(){
        assertEquals(0, busStop.getQueueSize());
    }

    @Test
    public void canAddPassengerToQueue(){
        busStop.addPassengerToQueue(passenger1);
        assertEquals(1, busStop.getQueueSize());
    }

    @Test
    public void canRemovePassagerFromQueue() {
        busStop.addPassengerToQueue(passenger1);
        busStop.removePassengerFromQueue();
        assertEquals(0, busStop.getQueueSize());
    }

}


