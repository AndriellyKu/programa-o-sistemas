package aula30.sistemadezoologico;

/**
 * Classe que representa um Réptil.
 * Implementa os métodos de emissão de som e alimentação para répteis.
 */
public class Reptil extends Animal {

    /**
     * Construtor da classe Reptil.
     *
     * @param nome     o nome do réptil
     * @param idade    a idade do réptil
     * @param especie  a espécie do réptil
     */
    public Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo um som de réptil.");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado com insetos.");
    }
}
