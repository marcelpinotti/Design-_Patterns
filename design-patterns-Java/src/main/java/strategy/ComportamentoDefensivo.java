package strategy;

//Assinatura do contrato para implementação da interface

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover(){
        System.out.println("Movendo-se defencivamente.");
    }
}
