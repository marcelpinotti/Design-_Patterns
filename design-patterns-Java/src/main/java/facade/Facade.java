package facade;

import subSistemaDoisFacade.CEPApi;
import subSistemaUmFacade.CRMService;

public class Facade {

    public void migrarCliente(String nome, String cep){

        String cidade = CEPApi.getInstancia().recuperarCidade(cep);
        String estado = CEPApi.getInstancia().recuperarEstado(cep);
        CRMService.gravarCliente(nome, cidade, cep, estado);
    }
}
