package aula30.sistemazoologico;

public class Exercicio5Mamifero extends Exercicio5Animal implements Exercicio5Cuidador {

    public Exercicio5Mamifero(String nome, int idade, String especie) {
        super(nome, idade, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " está emitindo um som típico de mamífero.");
    }

    @Override
    public void alimentar() {
        System.out.println(nome + " está sendo alimentado com comida adequada para mamíferos.");
    }

    @Override
    public void cuidar() {
        System.out.println("Cuidando de " + nome + " com atividades específicas para mamíferos.");
    }
}
