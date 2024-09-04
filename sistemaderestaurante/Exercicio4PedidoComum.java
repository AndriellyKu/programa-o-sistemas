package aula30.sistemaderestaurante;

import java.util.List;

/**
 * Classe que representa um pedido comum no restaurante.
 * Implementa os métodos abstratos da classe Pedido.
 */
public class PedidoComum extends Pedido implements Desconto {

    /**
     * Construtor para a classe PedidoComum.
     *
     * @param numeroPedido O número identificador do pedido.
     * @param itens        A lista de itens do pedido.
     * @param status       O status atual do pedido.
     */
    public PedidoComum(int numeroPedido, List<String> itens, String status) {
        super(numeroPedido, itens, status);
    }

    /**
     * Calcula o total do pedido comum.
     *
     * @return O valor total dos itens do pedido.
     */
    @Override
    public double calcularTotal() {
        // Implementação simplificada
        return itens.size() * 10.0;
    }

    /**
     * Adiciona um item ao pedido comum.
     *
     * @param item O item a ser adicionado.
     */
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
    }

    /**
     * Remove um item do pedido comum.
     *
     * @param item O item a ser removido.
     */
    @Override
    public void removerItem(String item) {
        itens.remove(item);
    }

    /**
     * Aplica um desconto ao pedido comum.
     * Método definido pela interface Desconto.
     *
     * @param percentual O percentual de desconto a ser aplicado.
     * @return O valor do pedido após o desconto.
     */
    @Override
    public double aplicarDesconto(double percentual) {
        double total = calcularTotal();
        return total - (total * percentual / 100.0);
    }
}
