package br.com.etec.projetota.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.etec.projetota.model.Pedido;
import br.com.etec.projetota.repository.pedido.PedidoRepositoryQuery;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long>,PedidoRepositoryQuery{
	
}
