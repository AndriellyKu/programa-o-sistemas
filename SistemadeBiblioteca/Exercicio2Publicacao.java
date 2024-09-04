package aula30.SistemadeBiblioteca;

/**
 * Classe abstrata que representa uma publicação na biblioteca.
 * As publicações podem ser emprestadas, devolvidas e reservadas.
 */
public abstract class Exercicio2Publicacao {

    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    /**
     * Construtor para a classe Publicacao.
     *
     * @param titulo o título da publicação
     * @param autor o autor da publicação
     * @param anoPublicacao o ano de publicação
     */
    public Exercicio2Publicacao(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * Método abstrato para emprestar a publicação.
     */
    public abstract void emprestar();

    /**
     * Método abstrato para devolver a publicação.
     */
    public abstract void devolver();
}
