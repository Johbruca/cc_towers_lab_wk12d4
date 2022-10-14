import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(){
        this.bedRooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }

    public void checkInGuest(Room room, Guest guest){
        room.addGuestToRoom(guest);
    }

}
