package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;

public class Box<T extends Fruit> {


    private ArrayList<T> fructs;

    public Box() {
        this.fructs = new ArrayList<T>();
    }





    public void setFruit(T fruit) {
        this.fructs.add(fruit);
    }


    public void setFruit(T fruit, int amount) {

            for (int i = 0; i < amount; i++) {
                this.fructs.add(fruit);
            }

    }


    public float getWeight() {
        if (this.fructs.size() > 0) {

            float weight = fructs.get(0).getWeight() * fructs.size();
            System.out.format("\nВес коробки %.1f ",weight );
            return weight;
        }
        else {System.out.println("\nКоробка пуста");
            return 0;}
    }

    public boolean compare(Box anotherBox) {
        if (anotherBox.getWeight() == this.getWeight()){
            System.out.println("\nКоробки равны по весу");
            return true;
        }
        else {
            System.out.println("\nКоробки различны по весу");
            return false;
            }
    }

    public void movingFruits(Box anotherBox){
        if (this.fructs.size() == 0){
            System.out.println("Пересыпать нечего");
        }

        else {
            anotherBox.setFruit(fructs.get(0),fructs.size() );
            this.fructs.clear();
            System.out.println("Теперь в коробке " + anotherBox.getWeight() + " фруктов" );
        }
    }

}

