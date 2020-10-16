package com.company;

public class Main {

    public static void main(String[] args) {
        Computer_tech monoblok = new Computer_tech(23, "Asus", "i7");
        System.out.println(monoblok.getPrice()+" "+monoblok.getBrandName()+" "+ monoblok.getSpec()+" "+ monoblok.condition);

        Notebook ultrabook = new Notebook("i5",354);
        Notebook notebook = new Notebook("ACer", 600,"Pentium");
        System.out.println(ultrabook.getSpec()+ " "+ ultrabook.getPrice());
        System.out.println(notebook.getBrandName()+ " "+ notebook.getPrice()+" "+notebook.getSpec());
    }
}
