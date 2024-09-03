package aula30.sistemadeecommerce;

public class Exercicio7ProdutoDigital package aula30.sistemadeecommerce;

public class Exercicio7ProdutoDigital extends Exercicio7Produto implements Exercicio7Promocao {

    private double taxaDeDownload;

    public Exercicio7ProdutoDigital(String nome, double preco, String categoria, double taxaDeDownload) {
        super(nome, preco, categoria);
        this.taxaDeDownload = taxaDeDownload;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco + taxaDeDownload;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Produto Digital: " + nome + ", Categoria: " + categoria + ", Preço: " + preco + ", Taxa de Download: " + taxaDeDownload + ", Preço Final: " + calcularPrecoFinal());
    }

    @Override
    public void aplicarPromocao() {
        System.out.println("Aplicando promoção ao produto digital " + nome);
        preco *= 0.85; // Aplica um desconto de 15%
    }
}
{
}
