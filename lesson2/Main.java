public class Main {
    public static void main(String[] args) {



        Cat[] cats = {
                new Cat("Барсик", 5),
                new Cat("Мурзик", 10),
                new Cat("Кузя", 3),
                new Cat("Симба", 15),
                new Cat("Феликс", 20),
                new Cat("Астерикс", 7),
        };



        Plate plate = new Plate(50);
        System.out.println("В тарелке изначально " + plate.getFood() + " еды");
        for (Cat cat : cats){
            cat.eat(plate.getFood());
            plate.setFood(plate.getFood() - cat.getAppetite());
            plate.info();
        }

        plate.addFood(30);


    }
}