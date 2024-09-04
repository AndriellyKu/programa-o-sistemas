package aula30.sistemadejogos;

/**
 * Classe que representa um jogo de tabuleiro.
 */
public class Exercicio8JogoDeTabuleiro extends Exercicio8Jogo {

    /**
     * Construtor da classe Exercicio8JogoDeTabuleiro.
     *
     * @param titulo o título do jogo
     * @param genero o gênero do jogo
     * @param classificacaoEtaria a classificação etária do jogo
     */
    public Exercicio8JogoDeTabuleiro(String titulo, String genero, int classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo de tabuleiro: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando o jogo de tabuleiro: " + titulo);
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo de tabuleiro: " + titulo);
    }
}
