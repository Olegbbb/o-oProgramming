package ru.geekbrains.lesson3.task2;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee {

    double salaryRate;

    public Freelancer(String surName, String name, double salary, int birth) {
        super(surName, name, salary, birth);

    }

    @Override
    public double calculateSalary() {
        salaryRate = salary * 20 * 7;
        return salaryRate;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата (по ставке): %.2f; Возраст: %s",
                surName, name, calculateSalary(), super.getAge());
    }
}
