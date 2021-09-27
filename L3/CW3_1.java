package L3;

import java.util.Scanner;

interface Fruit {
    String getName();
    Double getWeight();
    boolean isTasty(String taste);
}
class Orange implements Fruit {
    @Override
    public String getName() {
        return("Апельсин");
    }
    public Double getWeight() {
        Scanner fruitWeight = new Scanner(System.in);
        Double  FruitWeight = fruitWeight.nextDouble();
        return FruitWeight;
    }
    public boolean isTasty(String taste) {
        if (taste.equals("Апельсин")) {
            return true;
        }
        else return false;
    }
}
class Banana implements Fruit {
    @Override
    public String getName() {
        return("Апельсин");
    }
    public Double getWeight() {
        Scanner fruitWeight = new Scanner(System.in);
        Double  FruitWeight = fruitWeight.nextDouble();
        return FruitWeight;
    }
    public boolean isTasty(String taste) {
        if (taste.equals("Банан")) {
            return true;
        }
        else return false;
    }
}
class Apple implements Fruit {
    @Override
    public String getName() {
        return("Яблоко");
    }
    public Double getWeight() {
        Scanner fruitWeight = new Scanner(System.in);
        Double  FruitWeight = fruitWeight.nextDouble();
        return FruitWeight;
    }
    public boolean isTasty(String taste) {
        if (taste.equals("Апельсин")) {
            return true;
        }
        else return false;
    }
}
public class CW3_1 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Fruit orange = new Orange();

        apple.getName();
        apple.getWeight();
        apple.isTasty("Яблоко");
        System.out.println(apple.getName() + apple.getWeight()+ apple.isTasty("Яблоко"));
    }
}