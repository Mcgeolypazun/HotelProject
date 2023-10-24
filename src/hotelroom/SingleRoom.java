package hotelroom;

import interfaces.HotelRoom;

public class SingleRoom extends HotelRoom {

    int roomSize = 10;
    int roomCost = 100000;
    String name;

    String uuid;
    @Override
    public int getRoomSize() {
        return this.roomSize;
    }

    @Override
    public int getRoomCost() {
        return this.roomCost;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
