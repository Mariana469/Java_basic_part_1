package com.learn.java.module4.basic4;

public class NumberHolder {
    private int anInt;
    private float aFloat;

    void printOnScreen() {
        System.out.println("My int is: " + anInt);
        System.out.println("My float is " + aFloat);
    }

    public void setAnInt(int anInt) {
        if (anInt < 0) {
            System.out.println("The number you entered is incorrect: " + anInt);
        } else {
            this.anInt = anInt;
        }
    }

    public void setaFloat(float aFloat) {
        if (aFloat < 0) {
            System.out.println("The number you entered is incorrect: " + aFloat);
        } else {
            this.aFloat = aFloat;
        }
    }
}
