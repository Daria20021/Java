package L3_2;

import java.util.Scanner;

public class HW3_2_1 {
    public static void main(String[] args) {
       String A = null;
        int MaxLenght = 0;
        int x = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scanner.nextLine();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            x = x + words[i].length();
            if (words[i].length() > MaxLenght) {
                MaxLenght = words[i].length();
                A = words[i];
            }
        }

        System.out.println("Число слов: " + words.length);
        System.out.println("Число символов без пробелов: " + x);
        System.out.println("Слово с максимальной длиной: " + A);
    }
}