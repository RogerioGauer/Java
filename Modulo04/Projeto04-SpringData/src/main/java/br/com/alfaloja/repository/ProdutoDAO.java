package br.com.alfaloja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.alfaloja.model.Produto;

@Repository
//<Produto, Long> = Especifica a classe e o tipo de Id, da tabela do banco de dados.
public interface ProdutoDAO extends JpaRepository<Produto, Long> {

}
