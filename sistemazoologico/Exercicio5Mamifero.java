package aula30.sistemadezoologico;

/**
 * Classe que representa um Mamífero.
 * Implementa os métodos de emissão de som e alimentação para mamíferos.
 */
public class Mamifero extends Animal {

    /**
     * Construtor da classe Mamifero.
     *
     * @param nome     o nome do mamífero
     * @param idade    a idade do mamífero
     * @param especie  a espécie do mamífero
     */
    public Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo um som de mamífero.");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado com leite.");
    }
}
