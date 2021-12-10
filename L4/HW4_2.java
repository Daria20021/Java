package L4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HW4_2{
    public static void main(String[] args) {

        Map<String, ArrayList<Integer>> planets = new HashMap<String, ArrayList<Integer>>();

        ArrayList<Integer> Venus = new ArrayList();
        Venus.add(1111111);
        Venus.add(2222222);
        Venus.add(3333333);
        planets.put("Венера", Venus);

        ArrayList<Integer> Saturn = new ArrayList();
        Saturn.add(4444444);
        Saturn.add(5555555);
        Saturn.add(6666666);
        planets.put("Сатурн", Saturn);

        ArrayList<Integer> Mercury = new ArrayList();
        Mercury.add(7777777);
        Mercury.add(8888888);
        Mercury.add(9999999);
        planets.put("Меркурий", Mercury);

        System.out.println("Название планеты:");
        Scanner scanner = new Scanner(System.in);
        String Keys = scanner.next();

        if (planets.containsKey(Keys)) {
            System.out.println("Расстояние до Солнца : " + planets.get(Keys).get(0));
            System.out.println("Масса : " + planets.get(Keys).get(1));
            System.out.println("Диаметр : " + planets.get(Keys).get(2));

        } else {
            System.out.println("Данной планеты нет в списке");
        }
    }
}
