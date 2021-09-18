package ДЗ2;

public class Circle {
    private static int x;
    private static int y;
    private static int r;

    public static void print() {
        System.out.println(x + y + r);
    }

    public void move() {
    }

    public static double distToOtherCircle() {
        double r = 4;
        return r;
    }

    public void changeRadius() {
    }

    public static double getPerimetr() {
        return 2 * (x + y);
    }

    public static double getSquare() {
        double r = 5;
        return r;
    }

    public Circle(int a, int b, int c) {
        this.x = a;
        this.y = b;
        this.r = c;
    }
}

class D {
    public static void main(String[] args) {
        Circle c = null;
        System.out.println(c.distToOtherCircle());
        System.out.println(c.getPerimetr());
        System.out.println(c.getSquare());

    }
}
