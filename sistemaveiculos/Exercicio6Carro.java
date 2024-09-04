package sistemaVeiculos;

/**
 * Classe que representa um carro.
 * Implementa os métodos abstratos da classe Veiculo e a interface Manutencao.
 */
public class Carro extends Veiculo implements Manutencao {

    /**
     * Construtor para a classe Carro.
     *
     * @param marca  a marca do carro
     * @param modelo o modelo do carro
     * @param ano    o ano do carro
     */
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " de " + ano + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O carro " + marca + " " + modelo + " de " + ano + " está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + marca + " " + modelo + " de " + ano + " está acelerando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada no carro " + marca + " " + modelo + " de " + ano + ".");
    }
}
