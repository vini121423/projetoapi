package br.com.etec.projetota.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.etec.projetota.model.Produto;
import br.com.etec.projetota.repository.produto.ProdutoRepositoryQuery;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>,ProdutoRepositoryQuery {
	public Page<Produto> findByNomeContainingOrderByNome(String nome, Pageable pageable);
}
