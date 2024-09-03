package aula30.sistemazoologico;

public abstract class Exercicio5Animal {

    protected String nome;
    protected int idade;
    protected String especie;

    public Exercicio5Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    public abstract void emitirSom();

    public abstract void alimentar();
}
