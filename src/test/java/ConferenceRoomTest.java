import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(2, "business");
    }

    @Test
    public void hasName(){
        assertEquals("business", conferenceRoom.getRoomName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, conferenceRoom.getCapacity());
    }


}
