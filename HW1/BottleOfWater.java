package HW1;

public class BottleOfWater extends Product {

    private int volume; // объем

    public int getVolume() {
        return volume;
    }

    public BottleOfWater(String name, double price, int volume){
        super(name, price);
        this.volume = volume;
    }

    public void sample1(int a, int b){

    }
    public void sample1(int csssssssssssss, int dsssssssssssssssss, int d){

    }
    public void sample1(int a, long b){

    }


    @Override
    public String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f - объем: %d", brand, name, price, volume);
    }
}
