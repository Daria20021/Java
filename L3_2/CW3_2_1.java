package L3_2;
import java.util.Scanner;

public class CW3_2_1 {

    public static void String_Length(String str) {
        System.out.println("Длина строки: " + str.length());
    }

    public static void String_Hash(String str) {
        System.out.println("Хеш строки: " + str.hashCode());
    }

    public static void String_Reverse(String str) {
        System.out.println("Строка наоборот: : " + new StringBuilder(str).reverse());
    }

    public static void String_substring(String str) {
        System.out.println("Обновленная строка с 0 номера до 5: " + str.substring(0, 5));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст, содержащий не менее 5 символов:");
        String T = scanner.nextLine();

        do {
            System.out.println("Введите команду: length, hash, reverse, substring :");
            String str = scanner.nextLine();

            switch (str) {
                case "length":
                    String_Length(T);
                    break;
                case "hash":
                    String_Hash(T);
                    break;
                case "reverse":
                    String_Reverse(T);
                    break;
                case "substring":
                    String_substring(T);
                    break;
                default:
                    System.out.println("Ошибка!");
            }
            System.out.println("Для окончания введите 'exit') ");
            T = scanner.nextLine();
        } while (!T.equals("exit"));
        System.out.println("Операция завершена");
    }

    }
