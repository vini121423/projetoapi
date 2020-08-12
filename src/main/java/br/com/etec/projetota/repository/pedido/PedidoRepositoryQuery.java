package br.com.etec.projetota.repository.pedido;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.etec.projetota.model.Pedido;
import br.com.etec.projetota.repository.filter.PedidoFilter;

public interface PedidoRepositoryQuery {
   public Page<Pedido> filtrar(PedidoFilter pedidoFilter,Pageable pageable);
}