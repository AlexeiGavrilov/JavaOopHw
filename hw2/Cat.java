package hw2;

public class Cat {
    private String name;
    private int appetite;
    private int satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public void eat(Plate a) {
        if (a.getFood() < appetite) {
            System.out.println(name + " не смог  поесть и остался голодным :( нужно положить еды");
            a.putFood();

        } else {
            a.decreseFood(appetite);
            satiety = +appetite;
        }

    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

}