package ru.geekbrains.lesson3.task2;

/**
 * Сотрудник
 */
public abstract class Employee implements Comparable<Employee> {


    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Имя
     */
    protected String name;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    protected int birth;

    public abstract double calculateSalary();


    public Employee(String surName, String name, double salary, int birth) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
        this.birth = birth;
    }

    public int getAge() {
        return 2023 - birth;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        int res = surName.compareTo(o.surName);
        if (res == 0){
            return name.compareTo(o.name);
        }
        return res;
    }
}
