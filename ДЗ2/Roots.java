package ДЗ2;

import java.util.Scanner;
public class Roots{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Значение a: ");
        double a = scanner.nextDouble();
        System.out.print("Значение b: ");
        double b = scanner.nextDouble();
        System.out.print("Значение c: ");
        double c = scanner.nextDouble();
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a);
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: " + x1 + "," + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Единственный корень: x = " + x);
        } else {
            System.out.println("Корней нет");
        }
    }
}