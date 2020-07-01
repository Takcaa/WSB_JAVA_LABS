package com.company.devices;

public class Disel extends Car {
    @Override
    void refuel() {
        System.out.printf("Paliwo zatankowane %s", this.model);
    }
}
