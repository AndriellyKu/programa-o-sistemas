package aula30.sistemadecombustivel;

public abstract class Exercicio3Transporte {

    protected int capacidade;
    protected double velocidadeMaxima;

    public Exercicio3Transporte(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public abstract void mover();

    public abstract void parar();
}
