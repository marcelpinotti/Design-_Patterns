package br.com.marcelpinotti.designpatterns.repositories;

import br.com.marcelpinotti.designpatterns.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * JpaRepository é uma STRATEGY que obriga a seguir a estratégia de implementação
 * Não é obrigatório a utilização da anotação @Repository
 */
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
