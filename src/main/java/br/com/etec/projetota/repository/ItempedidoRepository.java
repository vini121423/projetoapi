package br.com.etec.projetota.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.etec.projetota.model.Itempedido;

@Repository
public interface ItempedidoRepository extends JpaRepository<Itempedido,Long> {

}
