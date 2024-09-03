package aula30.sistemaderestaurante;

public class Exercicio4PedidoComum extends Exercicio4Pedido implements Exercicio4Desconto {

    public Exercicio4PedidoComum(int numeroDoPedido) {
        super(numeroDoPedido);
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (String item : itens) {
            total += 10.0;
        }
        return total;
    }

    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item " + item + " adicionado ao pedido " + numeroDoPedido);
    }

    @Override
    public void removerItem(String item) {
        itens.remove(item);
        System.out.println("Item " + item + " removido do pedido " + numeroDoPedido);
    }

    @Override
    public double aplicarDesconto(double valor) {
        return valor * 0.9;
    }
}
