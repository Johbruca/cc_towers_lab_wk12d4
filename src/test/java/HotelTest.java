import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

   Hotel hotel;
   Guest guest;
   Bedroom bedRoom;
   ConferenceRoom conferenceRoom;

   @Before
    public void before(){
       guest = new Guest("Dave");
       bedRoom = new Bedroom(RoomType.DOUBLE, 2);
       conferenceRoom = new ConferenceRoom(15, "business");
       hotel = new Hotel();
   }

   @Test
    public void canCheckIn(){
       hotel.checkIn(guest);
       assertEquals(1, hotel.)
   }

}
