package L4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CW4_3 {
    public static void main(String[] args) {
        Queue qc = new LinkedList<Character>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите символы:");
        String string = scanner.nextLine();
        for (char ch : string.toCharArray())
            qc.offer(ch);
        while (qc.peek() != null) {
            System.out.print(qc.poll() + " ");
        }

    }
}