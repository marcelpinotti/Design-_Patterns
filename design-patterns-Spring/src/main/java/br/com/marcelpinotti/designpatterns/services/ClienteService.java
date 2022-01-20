package br.com.marcelpinotti.designpatterns.services;

import br.com.marcelpinotti.designpatterns.models.Cliente;

/**
 * Interface que define o padrão STRATEGY no domínio do cliente.
 */

public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);
}
