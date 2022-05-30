package com.company;

import java.util.InputMismatchException;

public class Person {
    private String name;
    private String surName;
    private int yearsOfBirth;
    private int yearsOfStartWorked;

    public Person(String name, String surName, int yearsOfBirth, int yearsOfStartWorked) {
        this.name = name;
        this.surName = surName;
        this.yearsOfBirth = yearsOfBirth;
        this.yearsOfStartWorked = yearsOfStartWorked;

    }

    public void getInfo() {
        System.out.println(("Person name is: " + name + ", surname is: " + surName + ",\n birth year: " + yearsOfBirth +
                        ", year of start worked: " + yearsOfStartWorked)+",\n now he/she : " + (2022-yearsOfBirth)+
                " year's old, he/she have "+ (2022-yearsOfStartWorked)+ " year's experience." );
    }
}
