package aula30.sistemadecombustivel;

public class Exercicio3Aviao extends Exercicio3Transporte implements Exercicio3Combustivel {

    public Exercicio3Aviao(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public void mover() {
        System.out.println("O avião está voando a uma velocidade de " + velocidadeMaxima + " km/h.");
    }

    @Override
    public void parar() {
        System.out.println("O avião pousou e parou.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo o avião com querosene de aviação.");
    }
}
