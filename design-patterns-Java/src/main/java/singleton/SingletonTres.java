package singleton;

/**
 * @author Marcel Pinotti
 *  Consumo de memória otimizado
 */
public class SingletonTres {

    /*
    Encapsula uma instancia em uma classe estática interna.
    */

    private static class Suporte {
        public static SingletonTres instancia = new SingletonTres();
    }

    /* Construtor privado para que não possa ser instanciado  externamente;
    - Característica do Padrão Singleton;
    - Controla sua própria instância;
    */
    private SingletonTres() {
    }

    /* Método para retornar a instância.
    - expõe de maneira pública a instância.
    */
    public static SingletonTres getInstancia(){
        return Suporte.instancia;
    }
}
