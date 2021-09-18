package ДЗ1;

import java.util.Scanner;
import java.util.Arrays;

public class names {
    public static void main(String[] args) {

        String[] A = new String[]{"Ваня", "Петя", "Маша", "Даша"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        for (int i = 0; i < A.length; i++) {
            if (name.equals(A[i])) {
                System.out.println("Имя существует");
            } else {
                System.out.println("Имя отсутствует");
            }
        }

    }
}