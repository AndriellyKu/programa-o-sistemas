package aula30.sistemadejogos;

public class Exercicio8JogoDeCartas extends Exercicio8Jogo {

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
