package ro.uvt.p3.io;
import ro.uvt.p3.Fruit;
import ro.uvt.p3.Apple;
import ro.uvt.p3.Banana;
import ro.uvt.p3.Mango;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class InputDevice {
    private InputStream inputStream;

    public InputDevice() {
        this.inputStream = System.in;
    }


    public InputDevice(InputStream inputStream) {
        this.inputStream = inputStream;
    }


    public String scanNextLine() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        scanner.close();

        return input;
    }

    public ArrayList<Fruit> readFruit(int number) {
        ArrayList<Fruit> fruits = new ArrayList<Fruit>();

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) 
                fruits.add(new Apple(100, 20, 70, Fruit.Color.RED));
            else if (i % 3 == 1)
                fruits.add(new Banana(100, 20, 70));
            else 
                fruits.add(new Mango(100, 20, 70, Fruit.Color.YELLOW));
        }

        return fruits;
    }
}
