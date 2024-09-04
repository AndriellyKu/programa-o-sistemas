package aula30.sistemadezoologico;

/**
 * Interface que define o comportamento de um Cuidador.
 */
public interface Cuidador {

    /**
     * Método que define as ações de cuidado específicas para cada tipo de animal.
     *
     * @param animal o animal que será cuidado
     */
    void cuidar(aula30.sistemadezoologico.Animal animal);
}
