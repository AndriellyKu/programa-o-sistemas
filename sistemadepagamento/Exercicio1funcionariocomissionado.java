package sistemaPagamento;

/**
 * Classe que representa um funcionário comissionado.
 * O salário é composto de um salário base mais uma porcentagem sobre as vendas.
 */
public class FuncionarioComissionado extends Funcionario implements Pagamento {

    private double comissao;
    private double vendasTotais;

    /**
     * Construtor para a classe FuncionarioComissionado.
     *
     * @param nome        O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     * @param comissao    A porcentagem de comissão sobre as vendas.
     * @param vendasTotais O valor total das vendas realizadas pelo funcionário.
     */
    public FuncionarioComissionado(String nome, double salarioBase, double comissao, double vendasTotais) {
        super(nome, salarioBase);
        this.comissao = comissao;
        this.vendasTotais = vendasTotais;
    }

    /**
     * Calcula o salário do funcionário comissionado.
     *
     * @return O valor do salário composto pelo salário base mais a comissão.
     */
    @Override
    public double calcularSalario() {
        return salarioBase + (comissao * vendasTotais);
    }

    /**
     * Processa o pagamento para o funcionário comissionado.
     * Exibe no console o nome do funcionário e o valor do pagamento.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento para " + nome + ": " + calcularSalario());
    }
}
