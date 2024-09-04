package sistemaPagamento;

/**
 * Interface que define o comportamento de processamento de pagamento.
 * Deve ser implementada por todas as classes de funcionários.
 */
public interface Pagamento {

    /**
     * Processa o pagamento para o funcionário.
     */
    void processarPagamento();
}
