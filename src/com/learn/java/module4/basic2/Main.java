package com.learn.java.module4.basic2;

public class Main {
    public static void main(String[] args) {
        Computer firstComputer = new Computer();
        firstComputer.setScreenSize(7);
        firstComputer.setBrand("HP");
        firstComputer.printOnScreen();
        Computer secondComputer = new Computer();
        secondComputer.setBrand("Lenovo");
        secondComputer.setScreenSize(8);
        secondComputer.setType("Laptop");
        secondComputer.setNumberOfCores(3);
        secondComputer.printOnScreen();
    }
}
