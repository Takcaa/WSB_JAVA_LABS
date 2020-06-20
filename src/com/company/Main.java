package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Human typek = new Human();
        typek.firstName = "Marcin";
        typek.lastName = "byku";
        typek.setSalary(22323);
        typek.getSalary();
        typek.cash = 1000;

        Human typek2 = new Human();
        typek2.firstName = "Marcin";
        typek2.lastName = "byku";
        typek2.setSalary(22323);
        typek2.cash = 1000;
        Animal dog = new Animal("owczarek");
        typek.pet = dog;

        Human typek3 = new Human();
        typek3.firstName = "Maciej";
        typek3.lastName = "Fnatik";
        typek3.setSalary(22323);
        typek3.getSalary();
        typek3.cash = 1000;

        Phone telefon = new Phone();
        telefon.model = "modelA";
        telefon.producer = "Apple";
        telefon.yearOfProduction = "2001";

        Car merc = new Car();
        merc.model = "AMG111";
        merc.producer = "Mercedes";
        merc.yearOfProduction = "2012";
        merc.value = 2138;

        Car mercPrim = new Car();
        mercPrim.model = "AMG";
        mercPrim.producer = "Mercedes";
        mercPrim.yearOfProduction = "2012";
        mercPrim.value = 2138;

        typek.setCar(merc);
        typek2.setCar(mercPrim);


        dog.sell(typek,typek2, (double) 1);
        dog.sell(typek,typek2, (double) 1);
        dog.sell(typek2,typek, (double) 10000);

        merc.sell(typek, typek3, (double) 2000000);
        merc.sell(typek, typek3, (double) 20);
        merc.sell(typek, typek3, (double) 20);


    }
}
