package Ficha6UMA;

public class Car extends Vehicle {

    //construtor por omissao
    public Car() {
        super();
    }

    public Car(int year, String brand, String model, double price, String color) {
        super(year, brand, model, price, color);
    }

    @Override
    public String toString() {
        return "Car - " + super.toString();
    }
}
