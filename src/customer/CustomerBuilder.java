package customer;

import java.time.LocalDateTime;

public class CustomerBuilder {
    private String name;
    private String phone;
    private int money;
    private LocalDateTime uuid;

    public CustomerBuilder setName(String name){
        this.name = name;
        return this;
    }
    public CustomerBuilder setPhone(String phone){
        this.phone = phone;
        return this;
    }
    public CustomerBuilder setMoney(int money){
        this.money = money;
        return this;
    }
    public CustomerBuilder setUuid(LocalDateTime uuid){
        this.uuid = uuid;
        return this;
    }
    public Customer build(){
        return new Customer(name,phone,money,uuid);
    }

}
