package sistemaPagamento;

/**
 * Classe que representa um funcionário horista.
 * O salário é calculado com base no número de horas trabalhadas e na taxa por hora.
 */
public class FuncionarioHorista extends sistemaPagamento.Exercicio1funcionario implements Pagamento {

    private int horasTrabalhadas;

    /**
     * Construtor para a classe FuncionarioHorista.
     *
     * @param nome            O nome do funcionário.
     * @param salarioBase     A taxa por hora do funcionário.
     * @param horasTrabalhadas O número de horas trabalhadas no período.
     */
    public FuncionarioHorista(String nome, double salarioBase, int horasTrabalhadas) {
        super(nome, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    /**
     * Calcula o salário do funcionário horista.
     *
     * @return O valor do salário baseado nas horas trabalhadas.
     */
    @Override
    public double calcularSalario() {
        return salarioBase * horasTrabalhadas;
    }

    /**
     * Processa o pagamento para o funcionário horista.
     * Exibe no console o nome do funcionário e o valor do pagamento.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento para " + nome + ": " + calcularSalario());
    }
}
