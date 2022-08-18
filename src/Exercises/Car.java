package Exercises;

public class Car extends Vehicles {

    String Venda() {
        return "Carro a venda por: " + getValue();
    }

    public Car(String model, String color, double value) {
        super(model, color, value);
    }

    @Override
    public String toString() {
        return "Modelo: " + this.getModel() + " Cor: " + this.getColor() + " Valor: " + this.getValue();
    }
}
