package aula30.sistemadejogos;

/**
 * Classe que representa um jogo digital.
 */
public class Exercicio8JogoDigital extends Exercicio8Jogo implements Exercicio8Multiplayer {

    /**
     * Construtor da classe Exercicio8JogoDigital.
     *
     * @param titulo o título do jogo
     * @param genero o gênero do jogo
     * @param classificacaoEtaria a classificação etária do jogo
     */
    public Exercicio8JogoDigital(String titulo, String genero, int classificacaoEtaria) {
        super(titulo, genero, classificacaoEtaria);
    }

    @Override
    public void iniciar() {
        System.out.println("Iniciando o jogo digital: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando o jogo digital: " + titulo);
    }

    @Override
    public void finalizar() {
        System.out.println("Finalizando o jogo digital: " + titulo);
    }

    @Override
    public void conectarJogadores() {
        System.out.println("Conectando jogadores no jogo digital: " + titulo);
    }
}
