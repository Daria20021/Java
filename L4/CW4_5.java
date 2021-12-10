package L4;

import java.util.ArrayList;
import java.util.Collection;
public class CW4_5 {

    static <T> void printArray(T[] x) {
        for (T element : x) {
            System.out.print(element);
        }
    }
    static <T> void printCollection(Collection<T> y) {
        for (T element : y) {
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        Object[] object1 = new Object [] {"Один ", "Два ", "Три. "};
        Object[] object2 = new Object [] {5 ,6 ,7 };

        Collection<Object> obj1 = new ArrayList<>();
        obj1.add(8);
        obj1.add(9);
        obj1.add(10);

        Collection<Object> obj2 = new ArrayList<>();
        obj2.add("Одиннадцать ");
        obj2.add("Двенадцать ");
        obj2.add("Тринадцать. ");

        printArray(object1);
        printCollection(obj1);
        printArray(object2);
        printCollection(obj2);
    }
}