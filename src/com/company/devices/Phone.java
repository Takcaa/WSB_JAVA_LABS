package com.company.devices;

import com.company.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device {
    public Set<Application> apps = new TreeSet<Application>();
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

    public void installAnnApp(Human owner, Application newApp) {
        if (owner.cash > newApp.getPrice()) {
            apps.add(newApp);
            owner.cash -= newApp.getPrice();
        }
    }

    public boolean checkIfInstaled(Application app) {
        return apps.contains(app);
    }

    public boolean checkIfInstaled(String app) {
        for (Application a : apps) {
            if (a.appname == app) {
                return true;
            }
        }
        return false;
    }

    public void allFreeApps() {
        for (Application a : apps) {
            if (a.getPrice() <= 0) {
                System.out.println(a.appname);
            }
        }
    }
    public double costOfApps() {
        double cost = 0;
        for (Application a : apps) {
            cost+= a.getPrice();
        }
        return cost;
    }
    public void allApps() {
        Comparator<Application> alphApps = new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                if(o1.appname.compareTo(o2.appname) >0)
                    return 1;
                if(o1.appname.compareTo(o2.appname) <0)
                    return  -1;
                return 0;
            }
        };
        List<Application> arr = new ArrayList<Application>();
        arr.addAll(apps);
        Collections.sort(arr, alphApps);
        for (Application a : arr){
            System.out.println(a.appname);
        }
    }


}