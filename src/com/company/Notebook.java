package com.company;

final class Notebook extends Computer_tech {
    private int price;
    private String brandName;
    private String spec;
    private Condition condition;

    public Notebook() {
    }


    public Notebook(String spec, int price) {
        this.spec = spec;
        this.price = price;
    }

    public Notebook(String brandName, int price, String spec) {
        super.condition = condition;
        this.price = price;
        this.brandName = brandName;
        this.spec = spec;
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

    public Condition condition() {
        return condition;
    }

    public String defineCondition(String brandName, int prodYear, Condition condition) {
        return brandName + " " + condition + " " + prodYear;
    }
}
