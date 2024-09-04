package aula30.SistemadeEcommerce;

public class Exercicio7Main {

    public static void main(String[] args) {
        // Criando instâncias de diferentes tipos de produtos
        Exercicio7ProdutoFisico produtoFisico = new Exercicio7ProdutoFisico("Smartphone", 1500.00, "Eletrônicos");
        Exercicio7ProdutoDigital produtoDigital = new Exercicio7ProdutoDigital("E-book", 50.00, "Livros Digitais");
        Exercicio7ProdutoServico produtoServico = new Exercicio7ProdutoServico("Aula Particular", 200.00, "Educação");

        // Aplicando promoções aos produtos
        produtoFisico.aplicarPromocao();
        produtoDigital.aplicarPromocao();
        produtoServico.aplicarPromocao();

        // Calculando e exibindo os preços finais
        System.out.println("Preço final do produto físico: " + produtoFisico.calcularPrecoFinal());
        System.out.println("Preço final do produto digital: " + produtoDigital.calcularPrecoFinal());
        System.out.println("Preço final do serviço: " + produtoServico.calcularPrecoFinal());

        // Exibindo detalhes dos produtos
        produtoFisico.exibirDetalhes();
        produtoDigital.exibirDetalhes();
        produtoServico.exibirDetalhes();
    }
}
