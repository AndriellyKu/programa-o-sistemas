package aula30.sistemadejogos;

/**
 * Classe abstrata que representa um jogo.
 */
public abstract class Exercicio8Jogo {

    protected String titulo;
    protected String genero;
    protected int classificacaoEtaria;

    /**
     * Construtor da classe Exercicio8Jogo.
     *
     * @param titulo o título do jogo
     * @param genero o gênero do jogo
     * @param classificacaoEtaria a classificação etária do jogo
     */
    public Exercicio8Jogo(String titulo, String genero, int classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    /**
     * Inicia o jogo.
     */
    public abstract void iniciar();

    /**
     * Pausa o jogo.
     */
    public abstract void pausar();

    /**
     * Finaliza o jogo.
     */
    public abstract void finalizar();
}
