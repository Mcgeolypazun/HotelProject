package hotelroom;

import interfaces.HotelRoom;

public class DoubleRoom extends HotelRoom {

    int roomSize = 0;
    int roomCost = 0;
    boolean roomOccupation;

    String uuid;
    @Override
    public int getRoomSize() {
        return 0;
    }

    @Override
    public int getRoomCost() {
        return 0;
    }
}
