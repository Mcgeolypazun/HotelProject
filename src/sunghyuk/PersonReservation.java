package sunghyuk;

public class PersonReservation {
    String phone;
    String name;
    int money;
    public PersonReservation(String phone, String name, int money){
        this.phone = phone;
        this.name = name;
        this.money = money;
    }

    public String getPhone(){
        return phone;
    }
    public String getName(){
        return name;
    }
    public int getMoney(){
        return money;
    }

}
