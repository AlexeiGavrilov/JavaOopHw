package HW1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, int volume){
        for (Product product: products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottle = ((BottleOfWater)product);
                if (bottle.name.equals(name) && bottle.getVolume() == volume)
                    return bottle;
            }
        }
        return null;
    }

    public Candy getCandy(String name, int weight, String taste){
        for (Product product: products){
            if(product instanceof Candy){
                Candy candy = ((Candy)product);
                if(candy.name.equals(name) && candy.getWeight() == weight && candy.getTaste() == taste){
                    return candy;
                }
            }
        }
        return null;
    }


}
