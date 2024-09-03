package aula30.sistemazoologico;

public class Exercicio5Ave extends Exercicio5Animal implements Exercicio5Cuidador {

    public Exercicio5Ave(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está cantando ou emitindo sons característicos de aves.");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado com sementes e frutas.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidando de " + nome + " com atividades específicas para aves.");
    }
}
