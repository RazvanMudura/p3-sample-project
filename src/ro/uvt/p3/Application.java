package ro.uvt.p3;

import ro.uvt.p3.io.InputDevice;
import ro.uvt.p3.io.OutputDevice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.List;
import java.util.stream.Collectors;


public class Application {
    private InputDevice inputDevice;
    private OutputDevice outputDevice;

    public Application(InputDevice id, OutputDevice od) {
        this.inputDevice = id;
        this.outputDevice = od;
    }
    

    public void run(){
        System.out.println("ana are mere");
        this.countFruit(inputDevice.readFruit(10));
    }


    public void prepareFruit(ArrayList<Fruit> fruits) {
        for (Fruit fruit: fruits) {
            if (fruit instanceof Peelable) {
                Peelable p = (Peelable) fruit;
                if (p.hasPeel()) p.peelOff();
            }

            if (fruit instanceof SeedRemovable) {
                SeedRemovable s = (SeedRemovable) fruit;
                if (s.hasSeeds()) s.removeSeeds();
            }
        }
    }


    public int computeWeight(ArrayList<Fruit> fruits) {
        int totalWeight = 0;

        for (Fruit fruit: fruits)
            totalWeight += fruit.weight;
        
        
        return totalWeight;
    }


    public int computeSugarContent(ArrayList<Fruit> fruits) {
        int totalSugar = 0;

        for (Fruit fruit: fruits)
            totalSugar += fruit.sugar;
        
        
        return totalSugar;
    }


    public HashMap<String, Integer> countFruit(List<? extends Fruit> fruits) {
        HashMap<String, Integer> map  = new HashMap<String, Integer>();

        map.put("Banana", 0);
        map.put("Apple",  0);
        map.put("Mango",  0);

        for (int i = 0; i < fruits.size(); i++) {
            Fruit fruit = fruits.get(i);
            String fruitType = fruit.getClass().getSimpleName();

            Integer value = map.get(fruitType);
            map.put(fruitType, ++value);
        }

        return map;
    }



    public void filterSugar(ArrayList<Fruit> fruits) {
        fruits.stream().filter(fruit -> fruit.sugar <= 20);
    }   

    public int totalSugarStream(ArrayList<Fruit> fruits) {
        return fruits.stream().mapToInt(fruit -> fruit.sugar).sum();
    }   

    public List<Double> getFruitRatio(ArrayList<Fruit> fruits) {
        return fruits.stream().mapToDouble(fruit -> fruit.sugar / fruit.water).boxed().collect(Collectors.toList());
    }   


    
    public String mostPopularFruit(List<? extends Fruit> fruits) {
        HashMap<String, Integer> map  = this.countFruit(fruits);

        String maxFruit = "Banana";
        int maxAppearance = 0;

        Set<String> keySet = map.keySet();

        for(String key : keySet) {
            if (map.get(key) > maxAppearance) {
                maxAppearance = map.get(key);
                maxFruit = key;
            }
        }

        return maxFruit;
    }
}
