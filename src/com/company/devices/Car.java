package com.company.devices;

public class Car {
    public String model;
    public String producer;
    public String year;
    public double value;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", year='" + year + '\'' +
                ", value=" + value +
                '}';
    }
}
