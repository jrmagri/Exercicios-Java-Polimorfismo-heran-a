package Exercises;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Vehicles> lista = new ArrayList<Vehicles>();

        Car corsa = new Car("Corsa 2006", "Azul", 8000.00);
        lista.add(corsa);

        Car corolla = new Car("Corolla 2006", "Azul", 8000.00);
        lista.add(corolla);


        Motorcycle harleyDavison = new Motorcycle("Harley Davinson 2000", "Preta", 15000.00);
        lista.add(harleyDavison);

        Bus onibus = new Bus("Santa cruz  2019", "Branco", 58000.00);
        lista.add(onibus);

        for (Vehicles veiculos : lista
        ) {
            System.out.println(veiculos);
        }
    }
}
