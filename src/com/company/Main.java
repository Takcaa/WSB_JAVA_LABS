package com.company;

import com.company.creatures.Animal;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws Exception {
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

        Car merc = new Disel();
        merc.model = "AMG111";
        merc.producer = "Mercedes";
        merc.yearOfProduction = 3333;
        merc.value = 2138;

        Car mercPrim = new Electric();
        mercPrim.model = "AMG";
        mercPrim.producer = "Mercedes";
        mercPrim.yearOfProduction = 2013;
        mercPrim.value = 2138;

        typek.setCar(merc, 0);
        typek.setCar(mercPrim, 1);

        Pet cat = new Pet("Dachowiec");
        URL myURL = new URL("http://example.com/");
        System.out.println();
        System.out.println(typek.getCar(0));
        System.out.println(typek.getCar(1));
        // typek.getCar(1).toString();
        System.out.println(typek.garageValue());
        typek.garageSort();
        System.out.println(typek.getCar(0));
        System.out.println(typek.getCar(1));
        System.out.println("Liczba transakcji auta " + merc.model + " " + merc.nmbOfTransactions());
        System.out.println("check if was owner:" + merc.checkIfWasOwner(typek2));
        System.out.println("check sold a to b:" + merc.checkIfAsoldToB(typek, typek2));
        merc.sell(typek, typek2, 10.0);
        System.out.println("check if was owner:" + merc.checkIfWasOwner(typek2));
        System.out.println("check if was owner:" + merc.checkIfWasOwner(typek));
        //merc.sell(typek2, typek, 10.0);
        System.out.println("check sold a to b:" + merc.checkIfAsoldToB(typek2, typek));
        System.out.println("Liczba transakcji auta " + merc.model + " " + merc.nmbOfTransactions());

        Phone telefon = new Phone();
        telefon.model = "modelA";
        telefon.producer = "Apple";
        telefon.yearOfProduction = 2001;

        Application apk1 = new Application("opera", 20.0, 1.0);
        Application apk2 = new Application("anki", 0, 1.0);
        Application apk3 = new Application("zyzy", 0, 1.0);
        Application apk4 = new Application("baka", 5.0, 1.3);

        typek.phone = telefon;
        telefon.installAnnApp(typek,apk1);
        telefon.installAnnApp(typek,apk2);
        telefon.installAnnApp(typek,apk3);
        telefon.installAnnApp(typek,apk4);

        System.out.println("check if instaled opera : " +
                telefon.checkIfInstaled("opera"));
        System.out.println("check if instaled apk1: " + telefon.checkIfInstaled(apk1));

        telefon.allApps();
        System.out.println(telefon.costOfApps());
        telefon.allFreeApps();









    }
}
