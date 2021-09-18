package ДЗ2;

import java.util.Scanner;
public class A {
    protected void show(){
        System.out.println("Имя класса A");
    }

    protected void count(int a, int b) {
        int X = a + b;
        System.out.println("Сумма: " + X);
    }
    public static  void main(String[] args) {

        A a = new A();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1: ");
        String N1 = sc.nextLine();
        int R1 = Integer.parseInt(N1);

        System.out.println("Введите число 2: ");
        String N2 = sc.nextLine();
        int R2 = Integer.parseInt(N2);

        a.show();
        a.count(R1, R2);

        B b = new B();

        b.show();
        b.count(R1, R2);

        C c = new C();

        c.show();
        c.count(R1, R2);

        D d = new D();

        d.show();
        d.count(R1, R2);

    }

    static class B extends A {
        protected void show(){
            System.out.println("Имя класса B");
        }

        protected void count(int a, int b) {
            int Y = a - b;
            System.out.println("Разность: " + Y);
        }
    }

    static class C extends A {
        protected void show(){
            System.out.println("Имя класса C");
        }

        protected void count(int a, int b) {
            int Z = a * b;
            System.out.println("Произведение: " + Z);
        }
    }

    static class D extends B {
        protected void show(){
            System.out.println("Имя класса D");
        }

        protected void count(int a, int b) {
            int F = a / b;
            System.out.println("Частное: "+ F);
        }
    }

}
