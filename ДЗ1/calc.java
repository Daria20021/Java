package ДЗ1;

import java.util.Scanner;
public class calc {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    String A;
    int C;
    do {
      System.out.print("Выберите операцию (Сложение, Вычитание, Умножение, Деление): ");
      A = scanner.next();
      switch (A) {
        case "Сложение": {
          System.out.print("Введите числа:");
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          C = x + y;
          System.out.print("Ответ: " + C );
          break;
        }
        case "Вычитание": {
          System.out.print("Введите числа:");
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          C = x - y;
          System.out.print("Ответ: " + C );
          break;
        }
        case "Умножение": {
          System.out.print("Введите числа:");
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          C = x * y;
          System.out.print("Ответ: " + C );
          break;
        }
        case "Деление": {
          System.out.println("Введите числа:");
          int x = scanner.nextInt();
          int y = scanner.nextInt();
          C = x / y;
          System.out.print("Ответ: " + C );
          break;
        }
        default: {
          System.out.print("Ошибка!");
          break;
        }
      }
      System.out.println(" Продолжить? (y/n) ");
      A = scanner.next();
    } while (!A.equals("n"));
    System.out.println("Операция завершена");
  }
}