package com.learn.java.module4.basic2;

public class Computer {
    private String brand;
    private int screenSize;
    private int numberOfCores;
    private String type;

    void printOnScreen() {
        System.out.println("Brand: " + brand);
        System.out.println("Screen Size: " + screenSize);

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

