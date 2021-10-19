package L3_2;

import java.util.Scanner;

public class CW3_2_2 {
    public static void main(String[] args) {
        String A = "y";
        int i = 0;
        StringBuilder string = new StringBuilder();

        while (!A.equals("n")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String Text = scanner.nextLine();
            i = i + 1;
            string.append(Text);

            System.out.println("Для продолжения выберите (y/n)");
            do {
                A = scanner.nextLine();

            } while (A.equals("y"));
        }

        System.out.println("Итоговая строка: " + string);
        System.out.println("Длина строки: " + string.length());
        System.out.println("Количество вводов: " + i);

    }
}