package aula30.sistemadezoologico;

/**
 * Classe abstrata que representa um Animal no zoológico.
 */
public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String especie;

    /**
     * Construtor da classe Animal.
     *
     * @param nome     o nome do animal
     * @param idade    a idade do animal
     * @param especie  a espécie do animal
     */
    public Animal(String nome, int idade, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
    }

    /**
     * Método abstrato que deve ser implementado para emitir o som característico do animal.
     */
    public abstract void emitirSom();

    /**
     * Método abstrato que deve ser implementado para definir como o animal é alimentado.
     */
    public abstract void alimentar();
}
