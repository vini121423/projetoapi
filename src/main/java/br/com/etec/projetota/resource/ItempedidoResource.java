package br.com.etec.projetota.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.etec.projetota.service.ItempedidoService;

@RestController
@RequestMapping("/itenspedidos")
public class ItempedidoResource {
	@Autowired
	private ItempedidoService itemPedidoService;
}