package aula30.sistemaderestaurante;

import java.util.ArrayList;
import java.util.List;

public abstract class Exercicio4Pedido {

    protected int numeroDoPedido;
    protected List<String> itens;
    protected String status;

    public Exercicio4Pedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
        this.itens = new ArrayList<>();
        this.status = "Aberto";
    }

    public abstract double calcularTotal();

    public abstract void adicionarItem(String item);

    public abstract void removerItem(String item);

    public void mudarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}
