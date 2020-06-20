package com.company.devices;

import com.company.Human;

public class Phone extends Device{
    String screenSize;
    String os;

    public void trunOn() {
        System.out.println("Telefon wlaczony");
    }
    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this) {
            if (buyer.cash >= price) {
                buyer.cash -= price;
                seller.cash += price;
                buyer.phone = seller.phone;
                seller.pet = null;
                System.out.printf("Phone %s goscia %s sprzedano za %f kolesiowi %s",
                        this.model, seller.lastName, price, buyer.lastName);
            } else {
                System.out.println("Za malo pieniedzy na zakup");
            }
        } else {
            System.out.println("Ten telefon nie nalezy do ciebie.");
        }
    }
}