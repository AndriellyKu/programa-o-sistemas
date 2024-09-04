package sistemaVeiculos;

/**
 * Classe abstrata que representa um veículo.
 * Define os atributos e métodos abstratos que todos os veículos devem implementar.
 */
public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    /**
     * Construtor para a classe Veiculo.
     *
     * @param marca  a marca do veículo
     * @param modelo o modelo do veículo
     * @param ano    o ano do veículo
     */
    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    /**
     * Método abstrato para ligar o veículo.
     */
    public abstract void ligar();

    /**
     * Método abstrato para desligar o veículo.
     */
    public abstract void desligar();

    /**
     * Método abstrato para acelerar o veículo.
     */
    public abstract void acelerar();
}
