package aula30.sistemadepagamento;

public abstract class Exercicio1funcionario package sistemaPagamento;

public abstract class Exercicio1Funcionario {

    protected String nome;
    protected double salarioBase;

    public Exercicio1Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
}

