package aula30.SistemadeEcommerce;

/**
 * Classe abstrata que representa um produto no sistema de e-commerce.
 * Um produto pode ser um produto físico, digital ou um serviço.
 */
public abstract class Exercicio7Produto {

    protected String nome;
    protected double preco;
    protected String categoria;

    /**
     * Construtor para a classe Produto.
     *
     * @param nome      o nome do produto
     * @param preco     o preço do produto
     * @param categoria a categoria do produto
     */
    public Exercicio7Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    /**
     * Método abstrato para calcular o preço final do produto, aplicando descontos ou taxas adicionais.
     *
     * @return o preço final do produto
     */
    public abstract double calcularPrecoFinal();

    /**
     * Método abstrato para exibir os detalhes do produto.
     */
    public abstract void exibirDetalhes();
}
