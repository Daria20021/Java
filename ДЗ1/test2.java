package ДЗ1;

public class test2 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;
        int r = 2;
        int h = 3;
        V1(x,y,z);
        V2(r);
        V3(r,h);
    }
    public static void V1(int x, int y, int z) {
        double V1 = x * y * z;
        System.out.println("Параллелепипед: " + V1);
    }
    public static void V2(int r) {
        double V2 = (4/3 * Math.PI * Math.pow(r,3));
        System.out.println("Шар: " + V2);
    }
    public static void V3(int r, int h) {
        double V3 = Math.PI * h + Math.pow(r,2);
        System.out.println("Цилиндр: " + V3);
    }
}
