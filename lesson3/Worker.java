package ru.geekbrains.lesson3.task2;

public class Worker extends Employee {

    public Worker(String surName, String name, double salary, int birth) {
        super(surName, name, salary,birth);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (фиксированная): %.2f; Возраст: %s",
                surName, name, calculateSalary(), super.getAge());
    }
}
