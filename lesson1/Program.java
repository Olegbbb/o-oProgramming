package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Product product1 = new Product();
        //product1.name = "ProductName1";
        //product1.brand = "ProductBrand";
        //product1.price = 200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product(null, "ProductBrand", 200);
        double d = product2.getPrice();
        System.out.println(d);
        product2.setPrice(400);
        //product2.name = "A";
        //product2.price = -300;
        System.out.println(product2.displayInfo());

        Product product3 = new Product("");
        System.out.println(product3.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Вода", "ООО Источник", 250, 2);
        System.out.println(bottleOfWater1.displayInfo());

        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Молоко#1", "ООО Молоко", 250, 1, 15);
        System.out.println(bottleOfMilk1.displayInfo());


        Product bottleOfWater2 = new BottleOfWater("Вода", "ООО Источник", 250, 1);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater3 = new BottleOfWater("Вода", "ООО Источник", 250, 1.5);
        System.out.println(bottleOfWater1.displayInfo());


        Product bottleOfMilk2 = new BottleOfMilk("Молоко#2", "ООО Молоко", 250, 1, 15);
        System.out.println(bottleOfMilk1.displayInfo());

        Product peanut1 = new Peanut("Арахис", "Джаз", 50, 50);
        System.out.println(peanut1.displayInfo());

        Product peanut2 = new Peanut("Арахис", "Джаз", 90, 100);
        System.out.println(peanut2.displayInfo());

        Product peanut3 = new Peanut("Арахис", "Джаз", 170, 200);
        System.out.println(peanut3.displayInfo());



        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfMilk2);
        products.add(bottleOfWater3);
        products.add(peanut1);
        products.add(peanut2);
        products.add(peanut3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Вода", 0.5);
        Peanut peanut = vendingMachine.getPeanut("Арахис", 70);
        if (bottleOfWater != null) {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWater.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        if (peanut != null) {
            System.out.println("Вы купили: ");
            System.out.println(peanut.displayInfo());
        }
        else {
            System.out.println("Такого арахиса нет в автомате.");
        }


        boolean f = true;

        while (f) {
            System.out.println("Меню");
            System.out.println("1 - Добавить новый товар");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Укажите пункт меню: ");
            int no = Integer.parseInt(scanner.nextLine());
            switch (no) {
                case 0: {
                    System.out.println("Завершение работы приложения");
                    f = false;
                }
                case 1: {
                    Product product = new BottleOfMilk("Молоко#2", "ООО Молоко", 250, 1, 15);
                    vendingMachine.addProduct(product);
                }
                break;
                default:
                    System.out.println("Укажите корректный пункт меню");
                    break;
            }

        }


    }

}
