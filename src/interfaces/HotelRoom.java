package interfaces;

public abstract class HotelRoom {
    int roomSize = 0;
    int roomCost = 0;
    String name;
    boolean roomOccupation;

    String uuid;

    public abstract int getRoomSize();

    public abstract int getRoomCost();

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
