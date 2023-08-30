package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        if (products == null){
            products = new ArrayList<>();
        }
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (product.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Peanut getPeanut(String name, int weight){
        for (Product product : products){
            if (product instanceof Peanut){
                Peanut peanut = (Peanut) product;
                if (product.getName().equals(name) && peanut.getWeight() == weight){
                    return peanut;
                }
            }
        }
        return null;
    }

}
