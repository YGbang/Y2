package com.sz.bean;

public class Book {

    private Double price;
    private String name;

    public Book() {

        System.out.println("书本无参");
    }
    public void destroy(){
        System.out.println("死了一本还有上千本");
    }

    public void init(){
        System.out.println("我的书名是："+name);
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
