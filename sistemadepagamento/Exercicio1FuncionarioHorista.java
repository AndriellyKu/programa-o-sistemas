package aula30.sistemadepagamento;

public class Exercicio1FuncionarioHorista extends Exercicio1Funcionario implements Pagamento {

    private int horasTrabalhadas;
    private double valorHora;

    public Exercicio1FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas, double valorHora) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento para " + nome + ": " + calcularSalario());
    }
}