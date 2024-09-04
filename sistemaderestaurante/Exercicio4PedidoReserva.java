package aula30.sistemaderestaurante;

import java.util.List;

/**
 * Classe que representa um pedido de reserva no restaurante.
 * Implementa os métodos abstratos da classe Pedido.
 */
public class Exercicio4PedidoReserva extends Pedido implements Desconto {

    private int numeroMesa;

    /**
     * Construtor para a classe PedidoReserva.
     *
     * @param numeroPedido O número identificador do pedido.
     * @param itens        A lista de itens do pedido.
     * @param status       O status atual do pedido.
     * @param numeroMesa   O número da mesa reservada.
     */
    public PedidoReserva(int numeroPedido, List<String> itens, String status, int numeroMesa) {
        super(numeroPedido, itens, status);
        this.numeroMesa = numeroMesa;
    }

    /**
     * Calcula o total do pedido de reserva.
     *
     * @return O valor total dos itens do pedido.
     */
    @Override
    public double calcularTotal() {
        return itens.size() * 10.0;
    }

    /**
     * Adiciona um item ao pedido de reserva.
     *
     * @param item O item a ser adicionado.
     */
    @Override
    public void adicionarItem(String item) {
        itens.add(item);
    }

    /**
     * Remove um item do pedido de reserva.
     *
     * @param item O item a ser removido.
     */
    @Override
    public void removerItem(String item) {
        itens.remove(item);
    }

    /**
     * Aplica um desconto ao pedido de reserva.
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
