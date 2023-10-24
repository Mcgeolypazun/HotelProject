package hotelroom;

import interfaces.HotelRoom;

public class TwinRoom extends HotelRoom {

    int roomSize = 20;
    int roomCost = 200000;
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
