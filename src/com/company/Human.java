package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human {
    public String firstName;
    public String lastName;
    protected Phone phone;
    public Animal pet;
    public Car auto;
    private double salary;

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
}
