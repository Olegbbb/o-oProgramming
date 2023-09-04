public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Осталось в тарелке: " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        if(food < 0){
            System.out.println("Недостаточно еды для этого кота");
        }
        else {
            this.food = food;
        }

    }
    public void addFood(int food){
        this.food = food + getFood();
        System.out.printf("Вы добавили %d\nТеперь в тарелке %d еды\n",food, this.food);

    }
}
