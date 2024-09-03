package aula30.sistemaderestaurante;

public class Exercicio4PedidoReserva extends Exercicio4Pedido {

    private int numeroDePessoas;

    public Exercicio4PedidoReserva(int numeroDoPedido, int numeroDePessoas) {
        super(numeroDoPedido);
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (String item : itens) {
            total += 10.0;
        }
        return total * numeroDePessoas;
    }

    @Override
    public void adicionarItem(String item) {
        itens.add(item);
        System.out.println("Item " + item + " adicionado ao pedido reserva " + numeroDoPedido);
    }

    @Override
    public void removerItem(String item) {
        itens.remove(item);
        System.out.println("Item " + item + " removido do pedido reserva " + numeroDoPedido);
    }

    public void mudarNumeroDePessoas(int novoNumeroDePessoas) {
        this.numeroDePessoas = novoNumeroDePessoas;
    }
}
