package aula30.sistemadecombustivel;

/**
 * Classe que representa uma Bicicleta.
 * Implementa os métodos de mover e parar para o comportamento específico de uma bicicleta.
 */
public class Exercicio3Bicicleta extends Exercicio3Transporte {

    /**
     * Construtor da classe Bicicleta.
     *
     * @param capacidade       a capacidade da bicicleta
     * @param velocidadeMaxima a velocidade máxima da bicicleta
     */
    public Exercicio3Bicicleta(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta está parando.");
    }
}
