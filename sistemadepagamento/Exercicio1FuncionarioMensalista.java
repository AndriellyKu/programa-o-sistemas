package sistemaPagamento;

import Aula22.Exemploexessão.Exemplo1;

/**
 * Classe que representa um funcionário mensalista.
 * O salário é fixo e igual ao salário base.
 */
public class FuncionarioMensalista extends sistemaPagamento.Exercicio1funcionario implements Pagamento {

    /**
     * Construtor para a classe FuncionarioMensalista.
     *
     * @param nome        O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário do funcionário mensalista.
     *
     * @return O valor do salário base.
     */
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    /**
     * Processa o pagamento para o funcionário mensalista.
     * Exibe no console o nome do funcionário e o valor do pagamento.
     */
    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento para " + nome + ": " + calcularSalario());
    }
}
