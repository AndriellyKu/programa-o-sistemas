package aula30.sistemazoologico;

public class Exercicio5Main {

    public static void main(String[] args) {
        Exercicio5Mamifero leao = new Exercicio5Mamifero("Leão", 5, "Panthera leo");
        leao.emitirSom();
        leao.alimentar();
        leao.cuidar();

        Exercicio5Ave papagaio = new Exercicio5Ave("Papagaio", 2, "Amazona aestiva");
        papagaio.emitirSom();
        papagaio.alimentar();
        papagaio.cuidar();

        Exercicio5Reptil cobra = new Exercicio5Reptil("Cobra", 3, "Naja naja");
        cobra.emitirSom();
        cobra.alimentar();
        cobra.cuidar();
    }
}
