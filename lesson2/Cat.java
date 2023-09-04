public class Cat {

    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public void eat(int food) {
        if (food >= this.appetite) {
            this.satiety = true;
            System.out.printf("Кот %s съедает %d еды, теперь он сыт\n", name, this.appetite);
        } else {
            System.out.printf("Кот %s остался голодным\n", name);
        }
    }


    public int getAppetite() {
        return appetite;
    }
}

