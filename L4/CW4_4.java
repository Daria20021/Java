package L4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CW4_4 {
    public static void main(String[] args) {
        Map <String, Integer> cars = new HashMap();
        cars.put("Lada1", 100);
        cars.put("Lada2", 200);
        cars.put("Lada3", 300);
        cars.put("Lada4", 400);

        for (Object key : cars.keySet()) {
            System.out.println(key + " - " + cars.get(key));
            System.out.println();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение  (Lada1, Lada2, Lada3, Lada4) : ");
        String car = scanner.nextLine();

        if (cars.containsKey(car)) {
            System.out.println(car + " стоит " + cars.get(car));
        } else {
            System.out.println("Такой машины нет");
        }

        System.out.println("Введите ключ (100,200,300,400) : ");
        String string = scanner.nextLine();
        Integer key = Integer.parseInt(string);
        if ( cars.containsValue(key)) {
            for (Map.Entry e :  cars.entrySet()) {
                if (e.getValue() == key) {
                    System.out.println(" За " + key + " можно купить " + e.getKey());
                }
            }
        } else {
            System.out.println("Такой цены нет");
        }
    }
}
