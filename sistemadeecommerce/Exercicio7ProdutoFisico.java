package aula30.sistemadeecommerce;

public class Exercicio7ProdutoFisico package aula30.sistemadeecommerce;

public class Exercicio7ProdutoFisico extends Exercicio7Produto implements Exercicio7Promocao {

    private double peso;
    private double taxaDeEnvio;

    public Exercicio7ProdutoFisico(String nome, double preco, String categoria, double peso, double taxaDeEnvio) {
        super(nome, preco, categoria);
        this.peso = peso;
        this.taxaDeEnvio = taxaDeEnvio;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxaDeEnvio;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Físico: " + nome + ", Categoria: " + categoria + ", Preço: " + preco + ", Peso: " + peso + "kg, Preço Final: " + calcularPrecoFinal());
    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Aplicando promoção ao produto físico " + nome);
        preco *= 0.9; // Aplica um desconto de 10%
    }
}
{
}
