package singleton;

/**
 * @author Marcel Pinotti
 *  Em um primeiro momento não disponibiliza uma instância para o usuário
 */
public class SingletonUm {

    private static SingletonUm instancia;

    /* Construtor privado para que não possa ser instanciado  externamente;
    - Característica do Padrão Singleton;
    - Controla sua própria instância;
    */
    private SingletonUm() {
    }

    /* Método para retornar a instância.
    - condição if criada dentro do método para que o objeto seja instanciado
    caso não haja instância da classe.
    - expõe de maneira pública a instância.
    */
    public static SingletonUm getInstancia(){
        if (instancia == null){
            instancia = new SingletonUm();
        }
        return instancia;
    }
}
