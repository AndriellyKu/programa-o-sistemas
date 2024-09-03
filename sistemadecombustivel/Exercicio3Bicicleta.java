package aula30.sistemadecombustivel;

public class Exercicio3Bicicleta extends Exercicio3Transporte {

    public Exercicio3Bicicleta(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está se movendo a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    @Override
    public void parar() {
        System.out.println("A bicicleta parou.");
    }
}
