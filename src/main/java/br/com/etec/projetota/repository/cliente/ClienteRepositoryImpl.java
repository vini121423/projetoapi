package br.com.etec.projetota.repository.cliente;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.etec.projetota.model.Cliente;

public class ClienteRepositoryImpl implements ClienteRepositoryQuery {
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Cliente> porNome(String nome) {
		String jpql = "from Cliente where lower(nome) like lower(:nome) order by nome";
		List<Cliente> clientesFiltrados = manager.createQuery(jpql, Cliente.class)
				.setParameter("nome", "%" + nome + "%").getResultList();

		return clientesFiltrados;
	}
}