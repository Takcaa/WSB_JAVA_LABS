package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Human {
    private static final int DEFAULT_GARAGE_SIZE = 2;
    public String firstName;
    public String lastName;
    public Phone phone;
    public Animal pet;
    private Car[] garage;
    private double salary;
    public double cash;

    public Human() {
        garage = new Car[DEFAULT_GARAGE_SIZE];
    }

    public void getSalary() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.printf("Data: %s | Salary: %f", dateFormat.format(date), salary);
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego");
            System.out.println("Konieczność odebrania aneksu do umowy od pani Hani z kadr");
            System.out.println(" ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu");
            this.salary = newSalary;
        }
    }

    public Car getCar(int id) {
        return this.garage[id];
    }

    public void setCar(Car newAuto, int id) {
        if (salary > newAuto.value) {
            System.out.println("Za gotowke bogaczu");
            this.garage[id] = newAuto;
        } else if (salary > newAuto.value / 12) {
            System.out.println("Kredycik na garage");
            this.garage[id] = newAuto;
        } else {
            System.out.println("Zmien kredyt wez prace");
        }
    }

    public void setBuyedCar(Car newAuto, int id) {
        this.garage[id] = newAuto;
    }

    public double garageValue() {
        double sumValue = 0;
        for (int i = 0; i < garage.length && garage[i] != null; i++) {
            sumValue += garage[i].value;
        }
        return sumValue;
    }

    public void garageSort() {
        Arrays.sort(garage);
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone=" + phone +
                ", pet=" + pet +
                '}';
    }

    public boolean hasCar(Car car) {
        for (int i = 0; i < garage.length && garage[i] != null; i++) {
            if (garage[i] == car) {
                return true;
            }
        }
        return false;
    }

    public boolean hasGarageSpace() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return true;
            }
        }
        return false;
    }

    public int freeGarageSpaceId() {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void removeCar(Car car) {
        for (int i = 0; i < garage.length; i++) {
            if (garage[i] == car) {
                garage[i] = null;
                System.out.println("car removerd");
            }
        }
    }

    public void addCar(Car car) {
    }
}
