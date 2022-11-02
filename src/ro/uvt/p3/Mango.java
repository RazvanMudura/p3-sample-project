package ro.uvt.p3;

public class Mango extends Fruit implements Peelable, SeedRemovable {
    boolean peel;
    boolean seeds;

    public Mango(int weight, int sugar, int water, Color color) {
        super(weight, sugar, water, color); 
        this.peel = true;
        this.seeds = true;
    }

    public boolean hasPeel() {
        return peel;
    }

    public void peelOff() {
        this.peel = false;
    }

    public boolean hasSeeds() {
        return seeds;
    }

    public void removeSeeds() {
        this.seeds = false;
    }
}
