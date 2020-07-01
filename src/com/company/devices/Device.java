package com.company.devices;

import com.company.sellable;

public abstract class Device implements sellable {
    public String producer;
    public String model;
    public double yearOfProduction;

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
