package br.com.etec.projetota.repository.produto;

import java.util.List;

import br.com.etec.projetota.model.Produto;

public interface ProdutoRepositoryQuery {
  public List<Produto> buscarPorNome(String nome);
}
