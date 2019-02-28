package com.soft1721.spring.hello;

public class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
public Phone(){
}
    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.getName();
        phone.getPrice();
    }
}
