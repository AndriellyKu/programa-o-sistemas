package aula30.SistemadeBiblioteca;

/**
 * Classe que representa um jornal na biblioteca.
 * Um jornal pode ser emprestado, devolvido e reservado.
 */
public class Exercicio2Jornal extends Exercicio2Publicacao implements Exercicio2Reservavel {

    /**
     * Construtor para a classe Jornal.
     *
     * @param titulo o título do jornal
     * @param autor o autor do jornal
     * @param anoPublicacao o ano de publicação do jornal
     */
    public Exercicio2Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        // Implementação do método de emprestar para jornal
    }

    @Override
    public void devolver() {
        // Implementação do método de devolver para jornal
    }

    @Override
    public void reservar() {
        // Implementação do método de reservar para jornal
    }
}
