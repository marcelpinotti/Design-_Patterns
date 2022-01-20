package br.com.marcelpinotti.designpatterns.repositories;

import br.com.marcelpinotti.designpatterns.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository é uma STRATEGY que obriga a seguir a estratégia de implementação
 * Não é obrigatório a utilização da anotação @Repository
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
