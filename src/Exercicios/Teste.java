package Exercicios;

public class Teste {
    public static void main(String[] args) {

        Vehicles c = new Car("Corsa Hatch", "Azul", 16000.00); //utilizando polimorfismo para instanciar um novo objeto
        c.setTurbo(true);

        Motorcycle m = new Motorcycle("CG", "PRATA", 8000.00);
        m.setTurbo(false);

        Owner paulo = new Owner("Paulo Silva", "422.048.098-45", "3365-9876");
        Owner carlos = new Owner("Carlos henrique", "322.434.45-54", "3368-5748");



        c.setOwner(paulo);
        m.setOwner(carlos);

        System.out.println("Dono do carro: " + c.getOwner().getName());
        System.out.println(c.getModel());
        System.out.println(c.getColor());
        System.out.println(c.getValue());
        System.out.println(c.isTurbo());
        System.out.println(c.Venda());

        System.out.println("----------------------------------------");

        System.out.println("Dono da moto: " + m.getOwner().getName());
        System.out.println(m.getModel());
        System.out.println(m.getColor());
        System.out.println(m.getValue());
        System.out.println(m.isTurbo());
        System.out.println(m.Venda());








    }
}
