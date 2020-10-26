package br.com.etec.projetota.repository.produto;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.etec.projetota.model.Produto;

public class ProdutoRepositoryImpl implements ProdutoRepositoryQuery {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Produto> buscarPorNome(String nome) {
		String jpql = "from Produto where lower(nome) like lower(:nome) order by nome";
		List<Produto> produtosSelecionados = entityManager.createQuery(jpql, Produto.class)
				.setParameter("nome", "%" + nome + "%").getResultList();

		return produtosSelecionados;
	}

}
