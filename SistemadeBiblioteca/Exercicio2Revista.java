package aula30.SistemadeBiblioteca;

public class Exercicio2Revista extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestada;

    public Exercicio2Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestada = false;
    }

    @Override
    public void emprestar() {
        if (emprestada) {
            System.out.println("A revista já está emprestada.");
        } else {
            emprestada = true;
            System.out.println("Revista emprestada: " + titulo);
        }
    }

    @Override
    public void devolver() {
        if (!emprestada) {
            System.out.println("A revista não está emprestada.");
        } else {
            emprestada = false;
            System.out.println("Revista devolvida: " + titulo);
        }
    }

    @Override
    public void reservar() {
        System.out.println("Revista reservada: " + titulo);
    }
}
