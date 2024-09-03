package aula30.sistemaveiculos;

public class Exercicio6Caminhao extends Exercicio6Veiculo implements Exercicio6Manutencao {

    public Exercicio6Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no caminhão " + marca + " " + modelo + ".");
    }
}
