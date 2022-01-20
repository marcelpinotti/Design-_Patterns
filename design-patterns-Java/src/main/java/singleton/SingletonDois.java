package singleton;

/**
 * @author Marcel Pinotti
 *  Disponibiliza uma instância para o usuário
 */
public class SingletonDois {

    private static SingletonDois instancia = new SingletonDois();

    /* Construtor privado para que não possa ser instanciado  externamente:
    - Característica do Padrão Singleton.
    - Controla sua própria instância.
    */
    private SingletonDois() {
    }

    /* Método para retornar a instância.
    - expõe de maneira pública a instância.
    */
    public static SingletonDois getInstancia(){
        return instancia;
    }
}
