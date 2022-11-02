package ro.uvt.p3;
import java.util.Collections;
import java.util.List;



public abstract class Fruit implements Comparable<Fruit> {
    int weight;
    int sugar;
    int water;
    Color color;

    public enum Color {
        RED,
        GREEN,
        BLUE,
        YELLOW,
        PURPLE;
    }

    public Fruit(int weight, int sugar, int water, Color color) {
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }

    public int compareTo(Fruit otherFruit) {
        if (this.weight < otherFruit.weight) return -1;
        else if (this.weight > otherFruit.weight) return 1;

        if (this.sugar < otherFruit.sugar) return -1;
        else if (this.sugar > otherFruit.sugar) return 1;

        return 0;
    }


    public void testFruitComparison(List<? extends Fruit> fruits) {
        Collections.sort(fruits);
        Fruit maxFruit = Collections.max(fruits);
        Fruit minFruit = Collections.min(fruits);
    }

}