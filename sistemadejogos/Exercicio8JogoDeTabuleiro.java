package aula30.sistemadejogos;

public class Exercicio8JogoDeTabuleiro extends Exercicio8Jogo {

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
