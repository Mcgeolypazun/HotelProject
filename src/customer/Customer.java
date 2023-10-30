package customer;
import sunghyuk.ReservationRoomDate;

import java.util.UUID;

public class Customer {
    private String name;
    private String phone;
    private int money;
    private UUID uuid;

    private ReservationRoomDate customerRoomDate;//HotelRoom객체, 시작시간, 종료시간

    public Customer(String name, String phone, int money, UUID uuid){
        this.name = name;
        this.phone = phone;
        this.money = money;
        this.uuid = uuid;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setCustomerRoomDate(ReservationRoomDate reservationRoomDate){
        this.customerRoomDate = reservationRoomDate;
    }

    public ReservationRoomDate getCustomerRoomDate() {
        return customerRoomDate;
    }
}
