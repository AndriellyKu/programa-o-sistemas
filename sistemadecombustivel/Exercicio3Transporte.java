package aula30.sistemadecombustivel;

/**
 * Classe abstrata que representa um Transporte.
 */
public abstract class Exercicio3Transporte {
    protected int capacidade;
    protected double velocidadeMaxima;

    /**
     * Construtor da classe Transporte.
     *
     * @param capacidade       a capacidade de carga ou de passageiros do transporte
     * @param velocidadeMaxima a velocidade máxima que o transporte pode atingir
     */
    public Exercicio3Transporte(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /**
     * Método abstrato que define como o transporte se move.
     */
    public abstract void mover();

    /**
     * Método abstrato que define como o transporte para.
     */
    public abstract void parar();
}
