package aula30.sistemazoologico;

public class Exercicio5Reptil extends Exercicio5Animal implements Exercicio5Cuidador {

    public Exercicio5Reptil(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo sons baixos ou sibilantes característicos de répteis.");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado com insetos, pequenos animais ou vegetais.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidando de " + nome + " com atividades específicas para répteis.");
    }
}
