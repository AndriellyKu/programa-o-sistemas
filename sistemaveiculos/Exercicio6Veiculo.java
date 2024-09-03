package aula30.sistemaveiculos;

public abstract class Exercicio6Veiculo {

    protected String marca;
    protected String modelo;
    protected int ano;

    public Exercicio6Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void ligar();

    public abstract void desligar();

    public abstract void acelerar();
}
