package ДЗ1;

import java.util.Scanner;

public class test4 {
    public static void main(String args[]) {
        String B;
        B = "y";
        int begin = 0;
        int end = 10;
do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Число:");
        int N = scanner.nextInt();

        if (N >= begin && N <= end) {
            System.out.println("В промежутке");
        } else {
            System.out.println("Нет в промежутке");
        }
        System.out.println(" Продолжить? (y/n) ");
        B = scanner.next();
    } while (!B.equals("n"));
    System.out.println("Операция завершена");
    }
}
