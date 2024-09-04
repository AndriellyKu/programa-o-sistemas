package aula30.sistemadecombustivel;

/**
 * Classe que representa um Carro.
 * Implementa os métodos de mover e parar para o comportamento específico de um carro.
 */
public class Exercicio3Carro extends Exercicio3Transporte implements Exercicio3Combustivel {

    /**
     * Construtor da classe Carro.
     *
     * @param capacidade       a capacidade do carro
     * @param velocidadeMaxima a velocidade máxima do carro
     */
    public Exercicio3Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    @Override
    public void parar() {
        System.out.println("O carro está parando.");
    }

    @Override
    public void abastecer() {
        System.out.println("O carro está sendo abastecido com combustível.");
    }
}
