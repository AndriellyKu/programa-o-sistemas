package aula30.SistemadeEcommerce;

/**
 * Classe que representa um produto físico no sistema de e-commerce.
 * Um produto físico tem um preço final que pode incluir custos de envio ou impostos.
 */
public class Exercicio7ProdutoFisico extends Exercicio7Produto implements Exercicio7Promocao {

    /**
     * Construtor para a classe ProdutoFisico.
     *
     * @param nome      o nome do produto físico
     * @param preco     o preço do produto físico
     * @param categoria a categoria do produto físico
     */
    public Exercicio7ProdutoFisico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularPrecoFinal() {
        // Implementação do cálculo do preço final para produto físico
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        // Implementação da exibição de detalhes do produto físico
    }

    @Override
    public void aplicarPromocao() {
        // Implementação da aplicação de promoção para produto físico
    }
}
