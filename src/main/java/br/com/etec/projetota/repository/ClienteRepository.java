package br.com.etec.projetota.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.etec.projetota.model.Cliente;
import br.com.etec.projetota.repository.cliente.ClienteRepositoryQuery;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery{
	public Page<Cliente> findByNomeContainingOrderByNome(String nome, Pageable pageable);
}
