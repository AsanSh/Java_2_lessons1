package com.company;

public class Technics {
    protected Condition condition;
    private int price;
    private String brandName;
    private String spec;

    public Condition getCondition() {
        return condition;
    }

    private String defineCondition(int prodYear, Condition condition) {
        return prodYear + " " + condition;
    }
}
