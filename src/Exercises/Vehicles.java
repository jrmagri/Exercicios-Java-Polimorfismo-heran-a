package Exercises;

public abstract class Vehicles {
    private Owner owner;
    private String model;
    private String color;
    private double value;
    private boolean isTurbo;

    public Vehicles(String modelo, String color, double value) {
        this.model = modelo;
        this.color = color;
        this.value = value;
    }

    String Venda() {
        return "Sou um meio de transporte";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setTurbo(boolean turbo) {
        isTurbo = turbo;
    }

    public boolean isTurbo() {
        return isTurbo;
    }
}



