package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Disel;
import com.company.devices.Electric;
import com.company.devices.Phone;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
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
        FarmAnimal dog = new FarmAnimal("owczarek");
        dog.name = "Kiez";
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

        Car merc = new Disel();
        merc.model = "AMG111";
        merc.producer = "Mercedes";
        merc.yearOfProduction = "2012";
        merc.value = 2138;

        Car mercPrim = new Electric();
        mercPrim.model = "AMG";
        mercPrim.producer = "Mercedes";
        mercPrim.yearOfProduction = "2012";
        mercPrim.value = 2138;

        typek.setCar(merc);
        typek2.setCar(mercPrim);

        Pet cat = new Pet("Dachowiec");
        URL myURL = new URL("http://example.com/");
        telefon.installAnnApp(myURL);
        telefon.installAnnApp("ABC");
        telefon.installAnnApp("abc", 3);
        telefon.installAnnApp("asd", 2, "xzczczc");
    }
}
