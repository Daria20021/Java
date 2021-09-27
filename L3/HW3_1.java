package L3;

class  N {
    Double a1;
    Double a2;
    Double b1;
    Double b2;

    N(double a1, double a2, double b1, double b2) {
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
    }
    N(double a1, double a2) {
        this.a1 = a1;
        this.a2 = a2;
    }
}
interface ArithmeticOperations {
    void add(N p);
    void subtract(N p);
    void multiply(N p);
    void divide(N p);
}
class Numbers implements ArithmeticOperations {

    @Override
    public void add(N p) {
        System.out.println(p.a1 + p.a2);
    }
    public void subtract(N p) {
        System.out.println(p.a1 - p.a2);
    }
    public void multiply(N p) {
        System.out.println(p.a1 * p.a2);
    }
    public void divide(N p) {
        System.out.println(p.a1 / p.a2);
    }
}
class ComplexNumbers implements ArithmeticOperations {

    @Override
    public void add(N p) {
        Double A = p.a1 + p.a2;
        Double B = p.b1 + p.b2;
        System.out.println(A + "+" + B + "i");
    }
    public void subtract(N p) {
        Double A = p.a1 - p.a2;
        Double B = p.b1 - p.b2;
        System.out.println(A + "+" + B + "i");
    }
    public void multiply(N p) {
        Double A = p.a1*p.a2 - p.b1*p.b2;
        Double B = p.a1*p.b2 + p.a2*p.b1;
        System.out.println(A + "+" + B + "i");
    }
    public void divide(N p) {
        Double A = (p.a1*p.a2 + p.b1*p.b2)/(Math.pow(p.a2,2) + Math.pow(p.b2,2));
        Double B = (p.b1*p.a2 - p.a1*p.b2)/(Math.pow(p.a2,2) + Math.pow(p.b2,2));
        System.out.println(A + "+" + B + "i");
    }
}
public class HW3_1 {
    public static void main(String[] args) {
        System.out.println("Обычные числа: ");
        N n1 = new N (6, 2);
        ArithmeticOperations operation1 = new Numbers();
        operation1.add(n1);
        operation1.subtract(n1);
        operation1.multiply(n1);
        operation1.divide(n1);

        System.out.println("Комплексные числа: ");
        N n2 = new N(3, 5, 1, 2);
        ArithmeticOperations operation2 = new ComplexNumbers();
        operation2.add(n2);
        operation2.subtract(n2);
        operation2.multiply(n2);
        operation2.divide(n2);

    }
}