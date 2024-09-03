package aula30.SistemadeBiblioteca;

public class Exercicio2Livro extends Exercicio2Publicacao implements Exercicio2Reservavel {

    private boolean emprestado;

    public Exercicio2Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
        this.emprestado = false;
    }

    @Override
    public void emprestar() {
        if (emprestado) {
            System.out.println("O livro já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("Livro emprestado: " + titulo);
        }
    }

    @Override
    public void devolver() {
        if (!emprestado) {
            System.out.println("O livro não está emprestado.");
        } else {
            emprestado = false;
            System.out.println("Livro devolvido: " + titulo);
        }
    }

    @Override
    public void reservar() {
        System.out.println("Livro reservado: " + titulo);
    }
}
