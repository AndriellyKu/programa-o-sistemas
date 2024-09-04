package sistemaPagamento;

/**
 * Classe abstrata que representa um funcionário genérico.
 * Todos os tipos de funcionários herdam desta classe.
 */
public abstract class Exercicio1funcionario {

    protected String nome;
    protected double salarioBase;

    /**
     * Construtor para a classe Funcionario.
     *
     * @param nome        O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Exercicio1funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Método abstrato para calcular o salário do funcionário.
     * Cada subclasse deve implementar este método de acordo com a regra específica.
     *
     * @return O valor do salário calculado.
     */
    public abstract double calcularSalario();
}
