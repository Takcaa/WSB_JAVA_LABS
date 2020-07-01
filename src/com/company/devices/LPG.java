package com.company.devices;

public class LPG extends Car {

    @Override
    void refuel() {
        System.out.printf("Dogazowano do %s", this.model);
    }
}
