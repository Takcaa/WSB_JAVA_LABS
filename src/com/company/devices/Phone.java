package com.company.devices;

public class Phone {
    public String producer;
    public String model;
    String screenSize;
    String os;

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}