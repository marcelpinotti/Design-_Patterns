package subSistemaDoisFacade;

import singleton.SingletonDois;

public class CEPApi {

    private static CEPApi instancia = new CEPApi();

    private CEPApi() {
    }

    public static CEPApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "São Paulo";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}

