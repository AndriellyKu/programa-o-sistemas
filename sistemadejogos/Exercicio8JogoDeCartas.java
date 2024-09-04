package aula30.sistemadejogos;

/**
 * Classe que representa um jogo de cartas.
 */
public class Exercicio8JogoDeCartas extends Exercicio8Jogo {

    /**
     * Construtor da classe Exercicio8JogoDeCartas.
     *
     * @param titulo o título do jogo
     * @param genero o gênero do jogo
     * @param classificacaoEtaria a classificação etária do jogo
     */
    public Exercicio8JogoDeCartas(String titulo, String genero, int classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo de cartas: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando o jogo de cartas: " + titulo);
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo de cartas: " + titulo);
    }
}
