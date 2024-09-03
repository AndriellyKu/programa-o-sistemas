package aula30.sistemaveiculos;

public class Exercicio6Carro extends Exercicio6Veiculo implements Exercicio6Manutencao {

    public Exercicio6Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O carro " + marca + " " + modelo + " está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção no carro " + marca + " " + modelo + ".");
    }
}
