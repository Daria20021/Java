package L3;

class Params{
    Double a;
    Double b;
    Double r;

    Params(double a,double b, double r) {
        this.a = a;
        this.b = b;
        this.r = r;
    }
}
    interface Figure {
        void getFigureName();
        Double getPerimeter(Params p);
        Double getSquare(Params p);
        void show(Params p);
    }
class Circle implements Figure {
    @Override
    public void getFigureName() {
        System.out.println("Circle");
    }
    public Double getPerimeter(Params p) {
        return 2*Math.PI*p.r;
    }
    public Double getSquare(Params p) {
        return Math.PI*Math.pow(p.r,2);
    }
    public void show(Params p) {
        System.out.println("Периметр: " + getPerimeter(p) + "  Площадь: " + getSquare(p));
    }
}

abstract class Quadrangle implements Figure {
    @Override
    public void getFigureName() {
        System.out.println("Quadrangle");
    }
    public abstract Double getPerimeter(Params p);
    public abstract Double getSquare(Params p);
    public void show(Params p) {
        System.out.println("Периметр: " + getPerimeter(p) + "  Площадь: " + getSquare(p));
    }
}
 class Square extends Quadrangle {
     @Override
     public void getFigureName() {
         System.out.println("Square");
     }
     public Double getPerimeter(Params p) {
         return 4*p.a;
     }
     public Double getSquare(Params p) {
         return Math.pow(p.a,2);
     }
 }

 class Rectangle extends Quadrangle {
 @Override
 public void getFigureName() {
         System.out.println("Rectangle");}
 public Double getPerimeter(Params p) {
         return 2*(p.a + p.b);
 }
 public Double getSquare(Params p) {
         return p.a*p.b;
 }
}
 public class CW3_2 {
     public static void main(String[] args) {
         Params p = new Params(1, 2, 3);
         System.out.println("Квадрат: ");
         Figure figure = new Square();
         figure.show(p);
         System.out.println("Прямоугольник: ");
         Figure figure1 = new Rectangle();
         figure1.show(p);
         System.out.println("Круг: ");
         Figure figure2 = new Circle();
         figure2.show(p);
     }
 }