package aula30.SistemadeBiblioteca;

public class Exercicio2Jornal extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestado;

    public Exercicio2Jornal(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (emprestado) {
            System.out.println("O jornal já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Jornal emprestado: " + titulo);
        }
    }

    @Override
    public void devolver() {
        if (!emprestado) {
            System.out.println("O jornal não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("Jornal devolvido: " + titulo);
        }
    }

    @Override
    public void reservar() {
        System.out.println("Jornal reservado: " + titulo);
    }
}
