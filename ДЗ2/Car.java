package ДЗ2;

import java.util.Scanner;
public class Car {
    String model;
    int maxSpeed;
    int weight;

    public Car(int carSpeed) {
        this.maxSpeed = carSpeed;
    }
    public Car(String carModel, int carWeight) {
        this.model = carModel;
        this.weight = carWeight;
    }
    public Car(String model, int maxSpeed, int weight) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }
    public void show() {
        if (model != null) {
            System.out.println("Модель: " + model);
        }
        if (maxSpeed != 0) {
            System.out.println("Максимальная скорость: " + maxSpeed);
        }
        if (weight != 0) {
            System.out.println("Вес: " + weight);
        }
    }
    public static  void main(String[] args) {
        String a;
        a = "y";

        while (a.equals("n") == false) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите модель:");
            String model = scanner.nextLine();

            System.out.println("Введите скорость:");
            String N1 = scanner.nextLine();
            int speed = Integer.parseInt(N1);

            System.out.println("Введите вес:");
            String N2 = scanner.nextLine();
            int weigth = Integer.parseInt(N2);

            Car car = new Car(model, speed, weigth);
            car.show();

            System.out.println("Для продолжения выберите y/n");
                a = scanner.nextLine();

        }
    }
}
