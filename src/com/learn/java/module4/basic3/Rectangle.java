package com.learn.java.module4.basic3;

public class Rectangle {
    private int width;

    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    void area() {
        System.out.println("Rectangle area is " + width * height);
    }
}

