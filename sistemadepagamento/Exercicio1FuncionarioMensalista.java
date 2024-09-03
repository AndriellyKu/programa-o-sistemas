package sistemaPagamento;

public class Exercicio1FuncionarioMensalista extends Funcionario implements Pagamento {

    public Exercicio1FuncionarioMensalista(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento para " + nome + ": " + calcularSalario());
    }
}
