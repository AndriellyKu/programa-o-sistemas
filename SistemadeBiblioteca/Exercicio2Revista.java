package aula30.SistemadeBiblioteca;

/**
 * Classe que representa uma revista na biblioteca.
 * Uma revista pode ser emprestada, devolvida e reservada.
 */
public class Exercicio2Revista extends Exercicio2Publicacao implements Exercicio2Reservavel {

    /**
     * Construtor para a classe Revista.
     *
     * @param titulo o título da revista
     * @param autor o autor da revista
     * @param anoPublicacao o ano de publicação da revista
     */
    public Exercicio2Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public void emprestar() {
        // Implementação do método de emprestar para revista
    }

    @Override
    public void devolver() {
        // Implementação do método de devolver para revista
    }

    @Override
    public void reservar() {
        // Implementação do método de reservar para revista
    }
}
