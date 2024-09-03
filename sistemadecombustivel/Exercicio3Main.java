package aula30.sistemadecombustivel;

public class Exercicio3Main {
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
