package aula30.sistemadecombustivel;

/**
 * Classe que representa um Avião.
 * Implementa os métodos de mover e parar para o comportamento específico de um avião.
 */
public class Exercicio3Aviao extends Exercicio3Transporte implements Exercicio3Combustivel {

    /**
     * Construtor da classe Aviao.
     *
     * @param capacidade       a capacidade do avião
     * @param velocidadeMaxima a velocidade máxima do avião
     */
    public Exercicio3Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("O avião está decolando e voando a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    @Override
    public void parar() {
        System.out.println("O avião está pousando e parando.");
    }

    @Override
    public void abastecer() {
        System.out.println("O avião está sendo abastecido com combustível.");
    }
}
