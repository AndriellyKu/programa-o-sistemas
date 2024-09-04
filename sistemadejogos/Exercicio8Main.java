package aula30.sistemadejogos;

/**
 * Classe principal para testar o sistema de gerenciamento de jogos.
 */
public class Exercicio8Main {

    public static void main(String[] args) {
        Exercicio8JogoDigital jogoDigital = new Exercicio8JogoDigital("Cyber Adventure", "Aventura", 16);
        jogoDigital.iniciar();
        jogoDigital.conectarJogadores();
        jogoDigital.pausar();
        jogoDigital.finalizar();

        Exercicio8JogoDeTabuleiro jogoTabuleiro = new Exercicio8JogoDeTabuleiro("Xadrez", "Estratégia", 10);
        jogoTabuleiro.iniciar();
        jogoTabuleiro.pausar();
        jogoTabuleiro.finalizar();

        Exercicio8JogoDeCartas jogoCartas = new Exercicio8JogoDeCartas("Poker", "Cartas", 18);
        jogoCartas.iniciar();
        jogoCartas.pausar();
        jogoCartas.finalizar();
    }
}
