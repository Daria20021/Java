package ДЗ2;

import java.util.Scanner;

public class MathUtils {
    public static void Sum(int x, int y) {
        int Sum = x + y;
        System.out.println("Сумма: " + Sum);
    }
    public static void Dif(int x, int y) {
        int Dif = x - y;
        System.out.println("Разность: " + Dif);
    }
    public static void Com(int x, int y) {
        int Com = x * y;
        System.out.println("Произведение: " + Com);
    }
    public static void Pri(int x, int y) {
        int Pri = x / y;
        System.out.println("Частное: " + Pri);
    }
    public static void Deg(int x, int y) {
        double Deg = Math.pow(x, y);
        System.out.println("Возведение в степень: " + Deg);
    }
    public static void Fact(int x) {
        int N = 1;
        for (int i = 1; i <= x; i++) {
            N = N * i;
        }
        System.out.println("Факториал: " + N);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        int N1 = Integer.parseInt(x);
        int N2 = Integer.parseInt(y);
        MathUtils.Sum(N1,N2);
        MathUtils.Dif(N1,N2);
        MathUtils.Com(N1,N2);
        MathUtils.Pri(N1,N2);
        MathUtils.Deg(N1,N2);
        MathUtils.Fact(N1);
        MathUtils.Fact(N2);


    }
}
