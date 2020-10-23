package com.company;

public class Main {

    public static void main(String[] args) {
        Computer_tech monoblok = new Computer_tech(23, "Asus", "i7");
        System.out.println(monoblok.getBrandName()+" "+ monoblok.getSpec()+" "+ monoblok.condition);
        Notebook ultrabook = new Notebook("Dell",544, "gaming", Condition.NEW);
        Notebook notebook = new Notebook("ACer", 600,"Pentium", Condition.NEW);
        System.out.println(ultrabook.getSpec());
        System.out.println(notebook.getBrandName()+ " "+notebook.getSpec());
    }
}
