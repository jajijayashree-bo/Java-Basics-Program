package com.company;

class Parent {
    int salary = 50000;

    public int getSalary() {
        return salary;
    }
}

class Child extends Parent {
    void displaySalary() {
        System.out.println("Salary is: " + getSalary());
    }
}

public class Company {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displaySalary();
    }
}
