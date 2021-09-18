package ДЗ1;

import java.util.Scanner;
public class calc {
  public static void main(String[] args) {
    double N1;
    double N2;
    double C;
    String A;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введите числа: ");
    N1 = scanner.nextDouble();
    N2 = scanner.nextDouble();
    System.out.print("Выберите операцию (Сложение, Вычитание, Умножение, Деление): ");
    A = scanner.next();

    switch(A) {
      case "Сложение": C = N1 + N2;
        break;
      case "Вычитание": C = N1 - N2;
        break;
      case "Умножение": C = N1 * N2;
        break;
      case "Деление" : C = N1 / N2;
        break;
      default:  System.out.print("Ошибка!");
        return;
    }
    System.out.print("Ответ: " + C);
  }
}
