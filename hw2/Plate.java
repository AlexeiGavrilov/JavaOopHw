package hw2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    
    public void info() {
        System.out.println("В тарелке сейчас " + food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
    
    boolean checkFood(int x) {
        return (food - x) >= 0;
    }

    public void putFood(){
        food += 100;
        System.out.printf("В миске теперь %d еды и хватит на всех", food);
    }

    public void decreseFood(int x) {
        food -= x;
        
    }
}