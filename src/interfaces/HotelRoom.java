package interfaces;

public abstract class HotelRoom {
    int roomSize = 0;
    int roomCost = 0;
    boolean roomOccupation;

    String uuid;

    public abstract int getRoomSize();

    public abstract int getRoomCost();

}
