package aula30.sistemadeecommerce;

public class Exercicio7ProdutoServico extends Exercicio7Produto implements Exercicio7Promocao {

    private double horasDeServico;
    private double taxaPorHora;

    public Exercicio7ProdutoServico(String nome, double preco, String categoria, double horasDeServico, double taxaPorHora) {
        super(nome, preco, categoria);
        this.horasDeServico = horasDeServico;
        this.taxaPorHora = taxaPorHora;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + (horasDeServico * taxaPorHora);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Serviço: " + nome + ", Categoria: " + categoria + ", Preço: " + preco + ", Horas de Serviço: " + horasDeServico + ", Preço Final: " + calcularPrecoFinal());
    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Aplicando promoção ao serviço " + nome);
        preco *= 0.95;
    }
}
