package com.company;

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

        Car merc2 = new Car();
        merc2.model = "AMGaa";
        merc2.producer = "Mercedes";
        merc2.year = "2012";
        merc2.value = 413800;

        typek.setCar(merc);
        typek.setCar(merc2);


    }
}
