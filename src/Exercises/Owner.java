package Exercicios;

public class Owner {

    private String name;
    private String cpf;
    private String telephone;

    public Owner(String name, String cpf, String telephone) {
        this.name = name;
        this.cpf = cpf;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
