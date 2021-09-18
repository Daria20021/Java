package ДЗ2;

public class Cylinder {
    protected void S (int h, int r) {
        double square = (2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2));
        System.out.println("Площадь поверхности: " + square);
    }
    protected void V (int h, int r) {
        double volume = (Math.PI * Math.pow(r, 2) * h);
        System.out.println("Объем: " + volume);
    }

    protected void S (double h, double r) {
        double square = (2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2));
        System.out.println("Площадь поверхности: " + square);
    }
    protected void V (double h, double r) {
        double volume = (Math.PI * Math.pow(r, 2) * h);
        System.out.println("Объем: " + volume);
    }

    protected void S (String a, String b) {
        double h = Double.parseDouble(a);
        double r = Double.parseDouble(b);
        double square = (2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2));
        System.out.println("Площадь поверхности: " + square);
    }
    protected void V (String a, String b) {
        double h = Double.parseDouble(a);
        double r = Double.parseDouble(b);
        double volume = (Math.PI * Math.pow(r, 2) * h);
        System.out.println("Объем: " + volume);
    }
}

