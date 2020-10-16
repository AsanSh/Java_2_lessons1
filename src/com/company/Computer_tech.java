package com.company;


public class Computer_tech extends Technics {
    private int price;
    private String brandName;
    private String spec;
    private MyClass_prodYear prodYear;

    public Computer_tech() {

    }

    //1
    public Computer_tech(int price, String brandName, String spec) {
        this.price = price;
        this.brandName = brandName;
        this.spec = spec;
    }

    //2
    public Computer_tech(int price, String brandName, String spec, Condition condition) {
        this.price = price;
        this.brandName = brandName;
        this.spec = spec;
        this.condition = condition;
    }

    //3
    public Computer_tech(int price, MyClass_prodYear prodYear) {
        this.price = price;
        this.prodYear = prodYear;
    }

    public int getPrice() {
        return price;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getSpec() {
        return spec;
    }

    public MyClass_prodYear getProdYear() {
        return prodYear;
    }
}

