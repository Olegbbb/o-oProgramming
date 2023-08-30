package ru.geekbrains.lesson1;

public class Peanut extends Product {

    private int weight; //Вес

    public int getWeight() {
        return weight;
    }

    public Peanut (String name, String brand, double price, int weight){
        super(name, brand, price);
        this.weight = weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Упаковка арахиса] %s - %s - %.2f - вес: %s", name, brand, price, weight);
    }
}
