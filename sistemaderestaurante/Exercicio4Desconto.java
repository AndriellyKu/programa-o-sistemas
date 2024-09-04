package sistemaRestaurante;

/**
 * Interface que define o comportamento de aplicação de desconto.
 * Deve ser implementada por todas as classes de pedido que oferecem desconto.
 */
public interface Exercicio4Desconto {

    /**
     * Aplica um desconto ao valor total do pedido.
     *
     * @param percentual O percentual de desconto a ser aplicado.
     * @return O valor do pedido após o desconto.
     */
    double aplicarDesconto(double percentual);
}
