package aula30.sistemaveiculos;

public class Exercicio6Moto extends Exercicio6Veiculo implements Exercicio6Manutencao {

    public Exercicio6Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("A moto " + marca + " " + modelo + " está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("A moto " + marca + " " + modelo + " está desligada.");
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + marca + " " + modelo + " está acelerando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Realizando manutenção na moto " + marca + " " + modelo + ".");
    }
}
