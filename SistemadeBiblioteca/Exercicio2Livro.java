package aula30.SistemadeBiblioteca;

/**
 * Classe que representa um livro na biblioteca.
 * Um livro pode ser emprestado, devolvido e reservado.
 */
public class Exercicio2Livro extends Exercicio2Publicacao implements Exercicio2Reservavel {

    /**
     * Construtor para a classe Livro.
     *
     * @param titulo o título do livro
     * @param autor o autor do livro
     * @param anoPublicacao o ano de publicação do livro
     */
    public Exercicio2Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        // Implementação do método de emprestar para livro
    }

    @Override
    public void devolver() {
        // Implementação do método de devolver para livro
    }

    @Override
    public void reservar() {
        // Implementação do método de reservar para livro
    }
}
