package aula30.sistemaderestaurante;

import java.util.List;

/**
 * Classe que representa um pedido de delivery no restaurante.
 * Implementa os métodos abstratos da classe Pedido.
 */
public class PedidoDelivery extends Pedido implements Desconto {

    private double taxaEntrega;

    /**
     * Construtor para a classe PedidoDelivery.
     *
     * @param numeroPedido O número identificador do pedido.
     * @param itens        A lista de itens do pedido.
     * @param status       O status atual do pedido.
     * @param taxaEntrega  A taxa de entrega para o pedido.
     */
    public PedidoDelivery(int numeroPedido, List<String> itens, String status, double taxaEntrega) {
        super(numeroPedido, itens, status);
        this.taxaEntrega = taxaEntrega;
    }

    /**
     * Calcula o total do pedido de delivery.
     *
     * @return O valor total dos itens do pedido mais a taxa de entrega.
     */
    @Override
    public double calcularTotal() {
        return (itens.size() * 10.0) + taxaEntrega;
    }

    /**
     * Adiciona um item ao pedido de delivery.
     *
     * @param item O item a ser adicionado.
     */
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
    }

    /**
     * Remove um item do pedido de delivery.
     *
     * @param item O item a ser removido.
     */
    @Override
    public void removerItem(String item) {
        itens.remove(item);
    }

    /**
     * Aplica um desconto ao pedido de delivery.
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
