package com.bosiy;

public class Employee {

    private String name;
    private String surname;
    private int age;
    private int salary;


    public Employee(String name, String surname, int age, int salary) {
        if(age <= 0 || salary <= 0) {
            System.out.println("You've passed incorrect information!");
            return;
        }

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        }

        public void allInformation() {
            System.out.println("Name: " + name + "\nSurname: " + surname + "\nAge: " + age
                    + "\nSalary: " + salary + "\n");
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSurname() {
            return this.surname;
        }
        public void setSurname(String name) {
            this.surname = surname;
        }
        public int getAge() {
            return this.age;
        }
        public void setAge(int age) {
        if(age <= 0) {
            System.out.println("Age you've passed is wrong!");
            return;
        }
            this.age = age;
        }
        public int getSalary() {
            return this.salary;
        }
        public void setSalary(int salary) {
        if(salary <= 0) {
            System.out.println("Salary you've passed is wrong!");
            return;
        }
            this.salary = salary;
        }
}
