package br.com.etec.projetota.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.etec.projetota.model.Cliente;
import br.com.etec.projetota.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/todos")
	public List<Cliente> listarTodosClientes() {
		return clienteService.listarClientes();
	}
	
	@GetMapping()
	public Page<Cliente> pesquisar(@RequestParam(required = false, 
			defaultValue = "") String nome, Pageable pageable) {
		return clienteService.pesquisar(nome, pageable);
	}

}
