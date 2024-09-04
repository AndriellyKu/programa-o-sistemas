package sistemaVeiculos;

/**
 * Classe que representa um caminhão.
 * Implementa os métodos abstratos da classe Veiculo e a interface Manutencao.
 */
public class Caminhao extends Veiculo implements Manutencao {

    /**
     * Construtor para a classe Caminhao.
     *
     * @param marca  a marca do caminhão
     * @param modelo o modelo do caminhão
     * @param ano    o ano do caminhão
     */
    public Caminhao(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void ligar() {
        System.out.println("O caminhão " + marca + " " + modelo + " de " + ano + " está ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("O caminhão " + marca + " " + modelo + " de " + ano + " está desligado.");
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão " + marca + " " + modelo + " de " + ano + " está acelerando.");
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Manutenção realizada no caminhão " + marca + " " + modelo + " de " + ano + ".");
    }
}
