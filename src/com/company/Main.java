package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        Human typek = new Human();
        typek.firstName = "Marcin";
        typek.lastName = "byku";
        typek.setSalary(22323);
        typek.getSalary();

        Animal dog = new Animal("owczarek");

        Car merc = new Car();
        merc.model = "AMG";
        merc.producer = "Mercedes";
        merc.year = "2012";
        merc.value = 2138;

        Car mercPrim = new Car();
        mercPrim.model = "AMG";
        mercPrim.producer = "Mercedes";
        mercPrim.year = "2012";
        mercPrim.value = 2138;

        typek.setCar(merc);
        typek.setCar(mercPrim);

        System.out.println(mercPrim);
        System.out.println(merc);
        System.out.println(typek);
        System.out.println(dog);


    }
}
