package sunghyuk;

import customer.Customer;
import interfaces.HotelRoom;

import java.util.*;
public class Hotel {
    static ArrayList<HotelRoom> hotelRooms;
    private static Hotel instance;
    private static int hotelAsset = 1000000000;

    public static ArrayList<Customer> reservedCustomer = new ArrayList<>();//호텔에 저장된 투숙객 정보

    public static Hotel getInstance(){
        if(instance == null){
            instance = new Hotel();
        }
        return instance;
    }

    public static int getHotelAsset() {
        return hotelAsset;
    }

    public void setHotelAsset(int fee) {
        this.hotelAsset += fee;
    }
}
