package ДЗ2;

public class Parallelepiped {

    private int a;
    private int b;
    private int c;

    public int getWidth() {
        return a;
    }

    public void setWidth(int a) {
        this.a = a;
    }

    public int getLenght() {
        return b;
    }

    public void setLenght(int b) {
        this.b = b;
    }

    public int getHeight() {
        return c;
    }

    public void setHeight(int c) {
        this.c = c;
    }

    Parallelepiped(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void V(Parallelepiped obj) {
        int V = getWidth() * getLenght() * getHeight();
        System.out.println("Объём: " + V);
    }

    public void S(Parallelepiped obj) {
        int S = 2 * (getWidth() * getLenght() + getLenght() * getHeight() + getWidth() * getHeight());
        System.out.println("Площадь поверхности: " + S);
    }

    public static void main(String[] args) {
        Parallelepiped parallelepiped = new Parallelepiped(2, 4, 8);
        parallelepiped.V(parallelepiped);
        parallelepiped.S(parallelepiped);

    }
}