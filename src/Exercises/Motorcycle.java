package Exercises;

public class Motorcycle extends Vehicles {

    String Venda() {
        return "Moto a venda por: " + getValue();
    }

    public Motorcycle(String model, String color, double value) {
        super(model, color, value);
    }

    @Override
    public String toString() {
        return "Modelo: " + this.getModel() + " Cor: " + this.getColor() + " Valor: " + this.getValue();
    }
}
