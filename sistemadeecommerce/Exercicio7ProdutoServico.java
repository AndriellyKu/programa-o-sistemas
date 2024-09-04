package aula30.SistemadeEcommerce;

/**
 * Classe que representa um serviço no sistema de e-commerce.
 * Um serviço pode ter um preço ajustado com base na duração ou complexidade.
 */
public class Exercicio7ProdutoServico extends Exercicio7Produto implements Exercicio7Promocao {

    /**
     * Construtor para a classe ProdutoServico.
     *
     * @param nome      o nome do serviço
     * @param preco     o preço do serviço
     * @param categoria a categoria do serviço
     */
    public Exercicio7ProdutoServico(String nome, double preco, String categoria) {
        super(nome, preco, categoria);
    }

    @Override
    public double calcularPrecoFinal() {
        // Implementação do cálculo do preço final para serviço
        return preco;
    }

    @Override
    public void exibirDetalhes() {
        // Implementação da exibição de detalhes do serviço
    }

    @Override
    public void aplicarPromocao() {
        // Implementação da aplicação de promoção para serviço
    }
}
