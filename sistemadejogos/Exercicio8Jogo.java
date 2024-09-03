package aula30.sistemadejogos;

public abstract class Exercicio8Jogo {

    protected String titulo;
    protected String genero;
    protected int classificacaoEtaria;

    public Exercicio8Jogo(String titulo, String genero, int classificacaoEtaria) {
        this.titulo = titulo;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public abstract void iniciar();

    public abstract void pausar();

    public abstract void finalizar();
}
