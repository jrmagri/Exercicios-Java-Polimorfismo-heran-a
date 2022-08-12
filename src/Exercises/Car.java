package Exercicios;

public class Car extends Vehicles {

    String Venda() {
        return "Carro a venda por: " + getValue();
    }

    public Car(String model, String color, double value) {
        super(model, color, value);
    }
}
