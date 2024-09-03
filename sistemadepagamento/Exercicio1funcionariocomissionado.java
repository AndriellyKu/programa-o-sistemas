package aula30.sistemaPagamento;

public class FuncionarioComissionado extends Funcionario implements Pagamento {

    private double vendas;
    private double taxaComissao;

    public funcionarioComissionado(String nome, double salarioBase, double vendas, double taxaComissao) {
        super(nome, salarioBase);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (vendas * taxaComissao);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento para " + nome + ": " + calcularSalario());
    }
}
