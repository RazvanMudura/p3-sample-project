package ro.uvt.p3;


public class Banana extends Fruit implements Peelable {
    boolean peel;

    public Banana(int weight, int sugar, int water) {
        super(weight, sugar, water, Color.YELLOW); 
        this.peel = true;
    }

    public boolean hasPeel() {
        return peel;
    }

    public void peelOff() {
        this.peel = false;
    }

}
