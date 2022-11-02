package ro.uvt.p3;


public class Apple extends Fruit implements SeedRemovable {
    boolean seeds;

    public Apple(int weight, int sugar, int water, Color color) {
        super(weight, sugar, water, color); 
        this.seeds = true;
    }


    public boolean hasSeeds() {
        return seeds;
    }

    public void removeSeeds() {
        this.seeds = false;
    }
}