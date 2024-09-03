package aula30.sistemadeecommerce;

public class Exercicio7Main {

    public static void main(String[] args) {
        Exercicio7ProdutoFisico produtoFisico = new Exercicio7ProdutoFisico("Livro", 50.0, "Educação", 1.2, 10.0);
        produtoFisico.aplicarPromocao();
        produtoFisico.exibirDetalhes();

        Exercicio7ProdutoDigital produtoDigital = new Exercicio7ProdutoDigital("E-book", 30.0, "Educação", 5.0);
        produtoDigital.aplicarPromocao();
        produtoDigital.exibirDetalhes();

        Exercicio7ProdutoServico produtoServico = new Exercicio7ProdutoServico("Aula Particular", 100.0, "Serviço", 2.0, 50.0);
        produtoServico.aplicarPromocao();
        produtoServico.exibirDetalhes();
    }
}
