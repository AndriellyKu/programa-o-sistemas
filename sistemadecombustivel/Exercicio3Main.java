package aula30.sistemadecombustivel;

/**
 * Classe principal para o sistema de transportes.
 * Demonstra o funcionamento de diferentes tipos de transportes: Carro, Bicicleta e Avião.
 */
public class Exercicio3Main {

    /**
     * Método principal que executa o programa.
     * Cria instâncias de Carro, Bicicleta e Avião, e chama seus métodos para demonstrar
     * o movimento, parada e, no caso de Carro e Avião, o abastecimento.
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Exercicio3Carro carro = new Exercicio3Carro(5, 180.0);
        Exercicio3Bicicleta bicicleta = new Exercicio3Bicicleta(1, 25.0);
        Exercicio3Aviao aviao = new Exercicio3Aviao(180, 900.0);

        carro.mover();
        carro.parar();
        carro.abastecer();

        bicicleta.mover();
        bicicleta.parar();

        aviao.mover();
        aviao.parar();
        aviao.abastecer();
    }
}
