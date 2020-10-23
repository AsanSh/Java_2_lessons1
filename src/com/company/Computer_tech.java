package com.company;


public class Computer_tech extends Technics {

    private String brandName;
    private String spec;
    private MyClass_prodYear prodYear;



    //1
    public Computer_tech(int price, String brandName, String spec) {
        super(price);
        this.brandName = brandName;
        this.spec = spec;
    }

    //2
    public Computer_tech(int price, String brandName, String spec, Condition condition) {
        super(price);
        this.brandName = brandName;
        this.spec = spec;
        this.condition = condition;
    }

    //3
    public Computer_tech(int price, MyClass_prodYear prodYear) {
       super(price);
        this.prodYear = prodYear;
    }

    public Computer_tech(int price) {
        super(price);
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

