package com.company.devices;

import com.company.Human;

import static java.lang.Integer.parseInt;

public abstract class Car extends Device implements Comparable<Car> {
    public double value;

    public int compareTo(Car other) {
        if (this.yearOfProduction > other.yearOfProduction)
            return 1;
        else
            return -1;
    }

    @Override
    public void trunOn() {
        System.out.println("Auto wlaczone");
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.cash < price) {
            throw new Exception("za malo kasy");
        }
        if (!seller.hasCar(this)) {
            throw new Exception("to nie twoje auto");
        }
        if (!buyer.hasGarageSpace()) {
            throw new Exception("Nie masz miejsca w garazu");
        }

        seller.removeCar(this);
        buyer.setBuyedCar(this, buyer.freeGarageSpaceId());
        buyer.cash -= price;
        seller.cash += price;
        System.out.println("sprzedano auto");
    }

    abstract void refuel();

    @Override
    public String toString() {
        return "Car{" + this.model +
                "value=" + value +
                "yearOfProd" + this.yearOfProduction +
                '}';
    }
}
