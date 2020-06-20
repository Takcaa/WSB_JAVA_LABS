package com.company.devices;

import com.company.Human;

public class Car extends Device {
    public double value;


    @Override
    public void trunOn() {
        System.out.println("Auto wlaczone");
    }

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() == this) {
            if (buyer.cash >= price) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.setBuyedCar(seller.getCar());
                seller.pet = null;
                System.out.printf("Auto %s goscia %s sprzedano za %f kolesiowi %s",
                        this.model, seller.lastName, price, buyer.lastName);
            } else {
                System.out.println("Za malo pieniedzy na zakup");
            }
        } else {
            System.out.println("Te auto nie nalezy do ciebie.");
        }
    }
}
