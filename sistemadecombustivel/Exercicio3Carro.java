package aula30.sistemadecombustivel;

public class Exercicio3Carro extends Exercicio3Transporte implements Exercicio3Combustivel {

    public Exercicio3Carro(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("O carro está se movendo a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    @Override
    public void parar() {
        System.out.println("O carro parou.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo o carro com gasolina.");
    }
}
