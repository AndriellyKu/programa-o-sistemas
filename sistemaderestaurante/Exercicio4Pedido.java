package aula30.sistemaderestaurante;

import java.util.List;

/**
 * Classe abstrata que representa um pedido genérico em um restaurante.
 * Subclasses devem implementar os métodos abstratos de acordo com o tipo específico de pedido.
 */
public abstract class Pedido {

    protected int numeroPedido;
    protected List<String> itens;
    protected String status;

    /**
     * Construtor para a classe Pedido.
     *
     * @param numeroPedido O número identificador do pedido.
     * @param itens        A lista de itens do pedido.
     * @param status       O status atual do pedido.
     */
    public Pedido(int numeroPedido, List<String> itens, String status) {
        this.numeroPedido = numeroPedido;
        this.itens = itens;
        this.status = status;
    }

    /**
     * Calcula o total do pedido.
     * Método abstrato que deve ser implementado por subclasses.
     *
     * @return O valor total do pedido.
     */
    public abstract double calcularTotal();

/**
 * Adiciona um item ao pedido.

