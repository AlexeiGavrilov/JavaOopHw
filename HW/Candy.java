package HW;

public class Candy extends Product{

    private Integer weight;
    private String taste;
    public Candy(String brand, String name, double price, Integer weight, String taste) {
        super(brand, name, price);
        this.weight = weight;
        this.taste = taste;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getTaste() {
        return taste;
    }
    public void setTaste(String taste) {
        this.taste = taste;
    }
    @Override
    public String displayInfo() {
        //return super.displayInfo();
        return String.format("%s - %s - %f рб. - вес: %d г. - вкус - %s", brand, name, price, weight, taste);
    }
    
   
    
    
}
