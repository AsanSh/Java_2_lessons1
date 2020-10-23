package com.company;

public class Technics {
    protected Condition condition;
    private int price;
    private String brandName;
    private String spec;

    public Technics(Condition condition, int price, String brandName, String spec) {
        this.condition = condition;
        this.price = price;
        this.brandName = brandName;
        this.spec = spec;
    }

    public Technics(long price) {

    }

    public Condition getCondition() {
        return condition;
    }

    private String defineCondition(int prodYear, Condition condition) {
        return prodYear + " " + condition;
    }
}
