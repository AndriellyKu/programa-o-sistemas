package aula30.sistemaderestaurante;

public class Exercicio4Main {

    public static void main(String[] args) {
        Exercicio4PedidoComum pedidoComum = new Exercicio4PedidoComum(1);
        pedidoComum.adicionarItem("Pizza");
        pedidoComum.adicionarItem("Refrigerante");
        double totalComum = pedidoComum.calcularTotal();
        double totalComDescontoComum = pedidoComum.aplicarDesconto(totalComum);
        System.out.println("Total Pedido Comum: " + totalComum);
        System.out.println("Total Pedido Comum com Desconto: " + totalComDescontoComum);

        Exercicio4PedidoDelivery pedidoDelivery = new Exercicio4PedidoDelivery(2, 5.0);
        pedidoDelivery.adicionarItem("Hambúrguer");
        pedidoDelivery.adicionarItem("Batata Frita");
        double totalDelivery = pedidoDelivery.calcularTotal();
        double totalComDescontoDelivery = pedidoDelivery.aplicarDesconto(totalDelivery);
        System.out.println("Total Pedido Delivery: " + totalDelivery);
        System.out.println("Total Pedido Delivery com Desconto: " + totalComDescontoDelivery);

        Exercicio4PedidoReserva pedidoReserva = new Exercicio4PedidoReserva(3, 4);
        pedidoReserva.adicionarItem("Lasanha");
        double totalReserva = pedidoReserva.calcularTotal();
        System.out.println("Total Pedido Reserva: " + totalReserva);
    }
}
