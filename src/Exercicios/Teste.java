package Exercicios;

public class Teste {
    public static void main(String[] args) {

        Veiculos c = new Carro(); //utilizando polimorfismo para instanciar um novo objeto
        c.setNomeDoDono("José Carlos");
        c.setModelo("Saveiro Turbo");
        c.setCor("Azul");
        c.setValor(16.000);

        System.out.println(c.Venda());



        Moto m = new Moto();
        m.setNomeDoDono("Fabio Silva");
        m.setModelo("CG");
        m.setCor("Prata");
        m.setValor(8.000);

        System.out.println(m.Venda()); //utilizando polimorfismo com metodo da classe mae reescritos

    }
}
