package br.com.etec.projetota.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.etec.projetota.model.Cliente;
import br.com.etec.projetota.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> listarClientes() {
		return clienteRepository.findAll();
	}
	
	public Page<Cliente> pesquisar(String nome, Pageable pageable) {
		return clienteRepository.findByNomeContaining(nome, pageable);
	}
}

