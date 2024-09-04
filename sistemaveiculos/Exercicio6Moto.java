package sistemaVeiculos;

/**
 * Classe que representa uma moto.
 * Implementa os métodos abstratos da classe Veiculo.
 */
public class Exercicio6Moto extends sistemaVeiculos.Veiculo {

    /**
     * Construtor para a classe Moto.
     *
     * @param marca  a marca da moto
     * @param modelo o modelo da moto
     * @param ano    o ano da moto
     */
    public Exercicio6Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("A moto " + marca + " " + modelo + " de " + ano + " está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("A moto " + marca + " " + modelo + " de " + ano + " está desligada.");
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + marca + " " + modelo + " de " + ano + " está acelerando.");
    }
}
