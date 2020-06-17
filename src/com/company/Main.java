package com.company;

public class Main {

    public static void main(String[] args) {
        Human typek = new Human();
        typek.firstName = "Marcin";
        typek.lastName = "byku";

        Animal dog = new Animal("owczarek");
        Car merc = new Car();
        merc.model = "AMG";
        merc.producer = "Mercedes";
        merc.year = "2012";
        typek.auto = merc;

    }
}
