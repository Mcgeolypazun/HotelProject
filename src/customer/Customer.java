package customer;
import java.time.LocalDateTime;
public class Customer {
    private String name;
    private String phone;
    private int money;
    private LocalDateTime uuid;

    Customer(String name,String phone,int money,LocalDateTime uuid){
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

    public LocalDateTime getUuid() {
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

    public void setUuid(LocalDateTime uuid) {
        this.uuid = uuid;
    }
}
