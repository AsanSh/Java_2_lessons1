package com.company;

final class Notebook extends Computer_tech {
    private String brandName;
    private String spec;
    private Condition condition;




    public Notebook(int price, String spec) {
        super(price);
        this.spec = spec;

    }

    public Notebook(String brandName, int price, String spec, Condition condition) {
        super(price);
        this.condition = condition;
        this.brandName = brandName;
        this.spec = spec;
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
