package br.com.etec.projetota.repository.cliente;

import java.util.List;

import br.com.etec.projetota.model.Cliente;

public interface ClienteRepositoryQuery  {
  public List<Cliente> porNome(String nome);
}
