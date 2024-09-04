package aula30.sistemadezoologico;

/**
 * Classe que representa uma Ave.
 * Implementa os métodos de emissão de som e alimentação para aves.
 */
public class Ave extends Animal {

    /**
     * Construtor da classe Ave.
     *
     * @param nome     o nome da ave
     * @param idade    a idade da ave
     * @param especie  a espécie da ave
     */
    public Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo um canto.");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentada com sementes.");
    }
}
