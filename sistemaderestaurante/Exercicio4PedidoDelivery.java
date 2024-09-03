package aula30.sistemaderestaurante;

public class Exercicio4PedidoDelivery extends Exercicio4Pedido implements Exercicio4Desconto {

    private double taxaEntrega;

    public Exercicio4PedidoDelivery(int numeroDoPedido, double taxaEntrega) {
        super(numeroDoPedido);
        this.taxaEntrega = taxaEntrega;
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (String item : itens) {
            total += 10.0;
        }
        return total + taxaEntrega;
    }

    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item " + item + " adicionado ao pedido delivery " + numeroDoPedido);
    }

    @Override
    public void removerItem(String item) {
        itens.remove(item);
        System.out.println("Item " + item + " removido do pedido delivery " + numeroDoPedido);
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.85; // Aplica 15% de desconto.
    }
}
