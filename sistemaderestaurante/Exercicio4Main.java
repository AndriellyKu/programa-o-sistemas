package sistemaRestaurante;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe principal para testar o sistema de restaurante.
 * Cria instâncias de diferentes tipos de pedidos e realiza operações de cálculo de total e aplicação de descontos.
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma lista de itens para o pedido comum
        List<String> itensComum = new ArrayList<>();
        itensComum.add("Hambúrguer");
        itensComum.add("Refrigerante");

        // Criando um pedido comum
        PedidoComum pedidoComum = new PedidoComum(1, itensComum, "Em preparo");
        System.out.println("Pedido Comum - Total: R$" + pedidoComum.calcularTotal());
        System.out.println("Pedido Comum - Total com Desconto: R$" + pedidoComum.aplicarDesconto(10));

        // Criando uma lista de itens para o pedido de delivery
        List<String> itensDelivery = new ArrayList<>();
        itensDelivery.add("Pizza");
        itensDelivery.add("Suco");

        // Criando um pedido de delivery
        PedidoDelivery pedidoDelivery = new PedidoDelivery(2, itensDelivery, "A caminho", 5.0);
        System.out.println("Pedido Delivery - Total: R$" + pedidoDelivery.calcularTotal());
        System.out.println("Pedido Delivery - Total com Desconto: R$" + pedidoDelivery.aplicarDesconto(15));

        // Criando uma lista de itens para o pedido de reserva
        List<String> itensReserva = new ArrayList<>();
        itensReserva.add("Salmão");
        itensReserva.add("Vinho");

        // Criando um pedido de reserva
        PedidoReserva pedidoReserva = new PedidoReserva(3, itensReserva, "Reservado", 12);
        System.out.println("Pedido Reserva - Total: R$" + pedidoReserva.calcularTotal());
        System.out.println("Pedido Reserva - Total com Desconto: R$" + pedidoReserva.aplicarDesconto(5));
    }
}
