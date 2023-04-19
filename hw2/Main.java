package hw2;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(40);
        plate.info();
        Cat[] cats = new Cat[] {
                new Cat("Марик", 20),
                new Cat("Феня", 14),
                new Cat("Сосиска", 18)
        };

        for (Cat cat : cats) {
            if (cat.getSatiety() == 0) {
                cat.eat(plate);
                System.out.println(cat.getName() + "  Поел и имеет сытость " + cat.getSatiety());
            }

        }

    }

}
