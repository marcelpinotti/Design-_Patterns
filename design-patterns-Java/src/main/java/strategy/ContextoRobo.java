package strategy;

/**
 * @author Marcel Pinotti
 *  Contexto são as classes que irão implamentar a interface.
 */
public class ContextoRobo {

    // atributo que irá intanciar a interface (implementar os comportamentos - strategy).
    // polimorfismo.
    // grande flexibilidade.
    private Comportamento strategy;

    // método set que permitirá a mudança de comportamento
    public void setStrategy(Comportamento strategy) {
        this.strategy = strategy;
    }

    // método que delega a implementação de diferentes algoritmos para a strategy
    public void mover(){
        strategy.mover();
    }
}
