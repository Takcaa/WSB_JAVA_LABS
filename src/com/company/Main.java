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

        Animal dog = new Animal("owczarek");

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
        typek.setCar(mercPrim);

        mercPrim.trunOn();
        telefon.trunOn();

        System.out.println(telefon);
        System.out.println(mercPrim);
        System.out.println(merc);
        System.out.println(typek);
        System.out.println(dog);


    }
}
