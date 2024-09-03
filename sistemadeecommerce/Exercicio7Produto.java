package aula30.sistemadeecommerce;

public abstract class Exercicio7Produto {

    protected String nome;
    protected double preco;
    protected String categoria;

    public Exercicio7Produto(String nome, double preco, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    public abstract double calcularPrecoFinal();

    public abstract void exibirDetalhes();
}
