package com.company.devices;

public class Electric extends Car {
    @Override
    void refuel() {
        System.out.printf("Prąd dodany do %s", this.model);
    }
}
