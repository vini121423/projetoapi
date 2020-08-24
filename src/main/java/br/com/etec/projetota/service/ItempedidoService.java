package br.com.etec.projetota.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.etec.projetota.repository.ItempedidoRepository;

@Service
public class ItempedidoService {
	@Autowired
	private ItempedidoRepository itemPedidoRepository;

}
