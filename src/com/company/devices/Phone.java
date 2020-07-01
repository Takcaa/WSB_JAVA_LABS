package com.company.devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device {
    String screenSize;
    String os;
    static final String address = "xyz.com";
    static final String protocol = "https://";
    static final double version = 1.0;

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

    public void installAnnApp(String appName) {
        System.out.printf("Instalacja aplikacji o nazwie %s", appName);
    }

    public void installAnnApp(String appName, double version) {
        System.out.printf("Instalacja aplikacji o nazwie %s w wersji: %f", appName, version);
    }

    public void installAnnApp(String appName, double version, String address) {
        System.out.printf("Instalacja aplikacji o nazwie %s w wersji: %f z adresem: %s"
                , appName, version, address);
    }

    public void installAnnApp(String[] appNameList) {
        System.out.printf("Instalacja aplikacji o nazwie %s", appNameList.toString());
    }

    public void installAnnApp(URL appAddres) {
        System.out.printf("Instalacja aplikacji z adresu %s", appAddres.toString());
    }
}