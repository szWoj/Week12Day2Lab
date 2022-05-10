import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;

    @Before
    public void before(){
        busStop = new BusStop("Haymarket");
        person = new Person();
    }

    @Test
    public void testAddPerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        assertEquals(2, busStop.personCount());
    }

    @Test
    public void testRemovePerson(){
        busStop.addPerson(person);
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(1, busStop.personCount());
    }

}
