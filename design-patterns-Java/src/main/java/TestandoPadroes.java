import facade.Facade;
import singleton.SingletonDois;
import singleton.SingletonTres;
import singleton.SingletonUm;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.ContextoRobo;

public class TestandoPadroes {

    public static void main(String[] args) {

        //Testes relacionados ao Design Pattern Singleton.

        SingletonUm lazy = SingletonUm.getInstancia();
        System.out.println("Endereço de memória - Lazy: " + lazy);
        lazy = SingletonUm.getInstancia();
        System.out.println("Mesmo endereço de memória - Lazy: " + lazy);

        SingletonDois eager = SingletonDois.getInstancia();
        System.out.println("Endereço de memória - Eager: " + eager);
        eager = SingletonDois.getInstancia();
        System.out.println("Mesmo endereço de memória - Eager: " + eager);

        SingletonTres holder = SingletonTres.getInstancia();
        System.out.println("Endereço de memória - Holder: " + holder);
        holder = SingletonTres.getInstancia();
        System.out.println("Mesmo endereço de memória - Holder: " + holder);

        //Testes relacionados ao Design Pattern Strategy.

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        ContextoRobo robo = new ContextoRobo();
        //permite a mudança de strategy (comportamento).
        robo.setStrategy(normal);
        robo.mover();
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Testes relacionados ao Design Pattern Facade.

        Facade facade = new Facade();
        facade.migrarCliente("Marcel Pinotti", "03201000");
    }
}
