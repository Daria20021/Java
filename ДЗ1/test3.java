import java.util.Scanner;
public class test3 {
    public static void main(String args[]) {
        int begin = 0;
        int end = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Число:");
        int N = scanner.nextInt();

        if (N >= begin && N <= end) {
            System.out.println("В промежутке");
        }
        else {
            System.out.println("Нет в промежутке");
        }
    }
}
