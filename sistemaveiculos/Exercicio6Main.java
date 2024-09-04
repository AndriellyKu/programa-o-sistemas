package sistemaVeiculos;

/**
 * Classe principal para testar o sistema de veículos.
 * Cria instâncias de diferentes tipos de veículos e realiza operações de ligar, desligar, acelerar e manutenção.
 */
public class Main {
    public static void main(String[] args) {
        // Criando instâncias de veículos
        Veiculo carro = new Carro("Ford", "Mustang", 2024);
        Veiculo moto = new Moto("Honda", "CB500", 2022);
        Veiculo caminhao = new Caminhao("Scania", "R450", 2023);

        // Testando operações de ligar, desligar e acelerar
        System.out.println("Carro:");
        carro.ligar();
        carro.acelerar();
        carro.desligar();
        ((Carro) carro).realizarManutencao();

        System.out.println("\nMoto:");
        moto.ligar();
        moto.acelerar();
        moto.desligar();
        // Moto não implementa a interface Manutencao

        System.out.println("\nCaminhão:");
        caminhao.ligar();
        caminhao.acelerar();
        caminhao.desligar();
        ((Caminhao) caminhao).realizarManutencao();
    }
}
