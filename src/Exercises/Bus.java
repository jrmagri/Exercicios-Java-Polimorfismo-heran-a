package Exercises;

public class Bus extends Vehicles {

    public Bus(String model, String color, double value) {
        super(model, color, value);
    }

    String Venda() {
        return ("Onibus a venda por: ");

    }

    @Override
    public String toString() {
        return "Modelo: " + this.getModel() + " Cor: " + this.getColor() + " Valor: " + this.getValue();
    }
}
