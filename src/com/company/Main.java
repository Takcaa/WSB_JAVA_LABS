package com.company;

public class Main {

    public static void main(String[] args) {
        Human typek = new Human();
        typek.firstName = "Marcin";
        typek.lastName = "byku";

        Animal dog = new Animal("owczarek");
        typek.pet = dog;
        typek.pet.feed();
        typek.pet.feed();
        typek.pet.feed();
        typek.pet.feed();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.takeForAWalk();
        typek.pet.feed();

    }
}
