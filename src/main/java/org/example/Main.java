package org.example;

import model.Student;

public class Main {
    public static void main(String[] args) {
        Student peter = new Student("Peter", "Müller", 0);
        System.out.println(peter.getPoints());
        System.out.println(peter);
    }
}
