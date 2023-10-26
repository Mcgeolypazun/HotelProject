package customer;

public class CustomerBuilder {
    private String name;
    private String phone;
    private int money;
    private String uuid;

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
    public CustomerBuilder setUuid(String uuid){
        this.uuid = uuid;
        return this;
    }
    public Customer build(){
        return new Customer(name,phone,money,uuid);
    }

}
