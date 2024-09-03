package aula30.sistemaveiculos;

public class Exercicio6Main {

    public static void main(String[] args) {
        Exercicio6Carro carro = new Exercicio6Carro("Toyota", "Corolla", 2020);
        carro.ligar();
        carro.acelerar();
        carro.desligar();
        carro.realizarManutencao();

        Exercicio6Moto moto = new Exercicio6Moto("Honda", "CB500", 2018);
        moto.ligar();
        moto.acelerar();
        moto.desligar();
        moto.realizarManutencao();

        Exercicio6Caminhao caminhao = new Exercicio6Caminhao("Volvo", "FH", 2015);
        caminhao.ligar();
        caminhao.acelerar();
        caminhao.desligar();
        caminhao.realizarManutencao();
    }
}
