package L4;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Planets {
    private int distanceToSun;
    private int mass;
    private int diameter;

    Planets(int x, int y, int z) {
        this.distanceToSun = x;
        this.mass = y;
        this.diameter = z;
    }

    int getDistanceToSun() {
        return distanceToSun;
    }
    int getMass() {
        return mass;
    }
    int getDiameter() {
        return diameter;
    }
    void setDistanceToSun(int x) {
        this.distanceToSun = x;
    }
    void setMass(int y) {
        this.mass = y;
    }
    void setDiameter(int z) {
        this.diameter = z;
    }
}
public class HW4_1 {
    public static void main(String[] args) {
        Map <String,Planets> planets = new HashMap<String, Planets>();
        planets.put("Венера", new Planets(1111111, 2222222, 3333333));
        planets.put("Сатурн", new Planets(4444444, 5555555, 6666666));
        planets.put("Меркурий", new Planets(7777777, 8888888, 9999999));

        System.out.println("Название планеты:");
        Scanner scanner = new Scanner(System.in);
        String Keys = scanner.next();
        if (planets.containsKey(Keys)) {
                System.out.println("Название планеты: " + Keys);
                System.out.println("Расстояние до Солнца: " + planets.get(Keys).getDistanceToSun() );
                System.out.println("Масса: " + planets.get(Keys).getMass());
                System.out.println("Диаметр: " + planets.get(Keys).getDiameter());
            }else {
            System.out.println("Данной планеты нет в списке");
        }
        }

    }