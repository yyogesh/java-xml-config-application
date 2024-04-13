package org.example;

import java.beans.ConstructorProperties;

public class Developer {

    private String name;
    private int number;
    private Student student;

    @ConstructorProperties({"number", "name1"})
    public Developer(String name, int number) {
        this.name = name;
        this.number = number;
        System.out.printf("Name is: %s, number is :: %d", name, number);
    }

    public String getName() {
        return name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Developer() {
        System.out.println("Developer object created..");
    }

    public void coding() {
        student.coding();
        // System.out.println("Coding new application");
    }
}
