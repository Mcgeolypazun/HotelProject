package sunghyuk;

import interfaces.HotelRoom;

import java.util.*;
public class Hotel {
    static ArrayList<HotelRoom> hotelRooms;
    private static int hotelAsset = 1000000000;

    public static int getHotelAsset() {
        return hotelAsset;
    }

    public void setHotelAsset(int hotelAsset) {
        this.hotelAsset = hotelAsset;
    }
}
