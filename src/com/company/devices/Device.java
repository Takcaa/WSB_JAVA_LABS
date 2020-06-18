package com.company.devices;

public abstract class Device {
    public String producer;
    public String model;
    public String yearOfProduction;

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }
    public abstract void trunOn();
}
