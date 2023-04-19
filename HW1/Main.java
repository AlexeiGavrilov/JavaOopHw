package HW1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        //product1.brand = "ООО Источник";
        //product1.name = "Бутылка с водой";
        //product1.price = 100.15;

        System.out.println(product1.displayInfo());

        Product product2 = new Product("Бутылка с молоком", 120.25);
        product2.param2 = "..";
        System.out.println(product2.displayInfo());

        //product2.price = -60;
        //product2.name = "______";
        System.out.println(product2.displayInfo());

        Product product3 = new Product("ss", "__", 100);
        System.out.println(product3.displayInfo());
        product3.setPrice(10);

        Product bottleOfWater1 = new BottleOfWater("Бутылка1", 100, 2);
        Product bottleOfMilk1 = new BottleOfMilk("Молоко", 200, 1, 10);
        Product bottleOfWater2 = new BottleOfWater("Бутылка2", 100, 1);
        Product bottleOfWater3 = new BottleOfWater("Бутылка3", 100, 2);
        Product bottleOfWater4 = new BottleOfWater("Бутылка3", 100, 2);

        String s = "123";
        String aaaa = "123";
        String s1 = new String("123");

        List<Product> products = new ArrayList<>();
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(bottleOfWater4);

        VendingMachine vendingMachine = new VendingMachine(products);

        BottleOfWater bottleOfWaterRes = vendingMachine.getBottleOfWater("Бутылка2", 1);
        if (bottleOfWaterRes != null){
            System.out.println("Вы купили: ");
            System.out.println(bottleOfWaterRes.displayInfo());
        }
        else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        Product candies1 = new Candy("Красный октябрь", "Мишки в лесу", 146.00, 100, "Шоколад");
        Product candies2 = new Candy("Марс", "Марс", 200.00, 120, "Шоколад");
        Product candies3 = new Candy("Марс", "Баунти", 196.00, 115, "Шоколад и кокос");
        Product candies4 = new Candy("Совен", "Бонпари", 146.00, 100, "Ассорти");
        Product candies5 = new Candy("Коркунов", "Корунов ", 999.00, 250, "Ассорти");
        List<Product> products2 = new ArrayList<>();
        products2.add(candies1);
        products2.add(candies2);
        products2.add(candies3);
        products2.add(candies4);
        products2.add(candies5);

        VendingMachine vendingMachine2 = new VendingMachine(products2);
        
        Candy candies = vendingMachine2.getCandy("Баунти", 115, "Шоколад и кокос");
        if(candies != null){
            System.out.println("Вы купили: " + candies.displayInfo());
        }
        else{
            System.out.println("Таких конфет нет");
        }

      

    }
}