package br.com.etec.projetota.repository.pedido;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.etec.projetota.model.Pedido;
import br.com.etec.projetota.repository.filter.PedidoFilter;

public class PedidoRepositoryImpl implements PedidoRepositoryQuery {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public Page<Pedido> filtrar(PedidoFilter pedidoFilter, Pageable pageable) {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Pedido> criteria = builder.createQuery(Pedido.class);

		Root<Pedido> root = criteria.from(Pedido.class);

		Predicate[] predicates = criarRestricoes(pedidoFilter, builder, root);
		criteria.where(predicates);
		criteria.orderBy(builder.desc(root.get("datapedido")));
		
		TypedQuery<Pedido> query = manager.createQuery(criteria);
        
	}

	private Predicate[] criarRestricoes(PedidoFilter pedidoFilter, CriteriaBuilder builder, Root<Pedido> root) {
		List<Predicate> predicates = new ArrayList<>();

		if (!StringUtils.isEmpty(pedidoFilter.getNome())) {
			predicates.add(builder.like(builder.lower(root.get("cliente").get("nome")),
					"%" + pedidoFilter.getNome().toLowerCase() + "%"));
		}

		if (pedidoFilter.getDataPedidoDe() != null) {
			predicates.add(builder.greaterThanOrEqualTo(root.get("datapedido"), pedidoFilter.getDataPedidoDe()));
		}

		if (pedidoFilter.getDataPedidoAte() != null) {
			predicates.add(builder.lessThanOrEqualTo(root.get("datapedido"), pedidoFilter.getDataPedidoAte()));
		}

		return predicates.toArray(new Predicate[predicates.size()]);
	}

}
