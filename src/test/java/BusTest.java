import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("North Berwick", 30);
        person = new Person();
        busStop = new BusStop("Haymarket");
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void testAddPassenger(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void capacityFullCannotAddPassenger(){
        bus = new Bus("North Berwick", 2);
        bus.addPassenger(person);
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void testRemovePassenger(){
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void testPickUpPassenger(){
        busStop.addPerson(person);
        bus.pickUpPassenger(busStop);
        assertEquals(1, bus.passengerCount());
        assertEquals(0, busStop.personCount());
    }





}
