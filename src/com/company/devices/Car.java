package com.company.devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public abstract class Car extends Device implements Comparable<Car> {
    public double value;
    public List<Human> owners = new ArrayList<>();

    public int compareTo(Car other) {
        if (other != null && this.yearOfProduction > other.yearOfProduction)
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
        if (!seller.hasCar(this) && owners.get(owners.size() - 1) != seller) {
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

    public boolean checkIfWasOwner(Human man) {
        for (Human owner : owners) {
            if (owner == man) {
                return true;
            }
        }
        return false;
    }

    public boolean checkIfAsoldToB(Human A, Human B) {
        for (int i = 0; i < owners.size() - 1; i++) {
            if (owners.get(i) == A && owners.get(i + 1) == B) {
                return true;
            }
        }
        return false;
    }

    public int nmbOfTransactions() {
        return owners.size(); //zakladam ze pierwsze kupno to tez transakcja
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
