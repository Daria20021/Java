package L4;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private int averageScore;

    Student (String a, int b, int c) {
        this.name = a;
        this.age = b;
        this.averageScore = c;
    }
    String getName () {
        return name;
    }
    int getAge () {
        return age;
    };
    int getAverageScore() {
        return averageScore;
    }
}

public class CW4_1 {
    public static void main(String[] args) {
        ArrayList<Student> student = new ArrayList<>();
        String ans = "y";
        int N = 0;
        int max = 0;

        while (!ans.equals("n")) {
            N++;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Имя студента:");
            String Name = scanner.nextLine();
            System.out.println("Возраст студента:");
            String age = scanner.nextLine();
            int Age = Integer.parseInt(age);
            System.out.println("Средний балл от 1 до 5 :");
            String mark = scanner.nextLine();
            int Mark = Integer.parseInt(mark);

            student.add(new Student(Name, Age, Mark));

            System.out.println("Для продлжение выберите: y/n");
            do {
                ans = scanner.nextLine();
            } while (!ans.equals("y") && !ans.equals("n"));
        }

            for (Student i : student) {
                if (i.getAverageScore() > max) {
                    max = i.getAverageScore();
                }
            }

            for (Student i : student) {
                if (i.getAverageScore() == max) {
                    System.out.println("Студент с самым высоким средним баллом:");
                    System.out.println("Имя: " + i.getName());
                    System.out.println("Возраст: " + i.getAge());
                    System.out.println("Средний бал: " + i.getAverageScore());
                }
            }

        }
    }
