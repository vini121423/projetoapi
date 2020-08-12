package br.com.etec.projetota.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.etec.projetota.model.Pedido;
import br.com.etec.projetota.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoResource {
  @Autowired
  private PedidoService pedidoService;
  
  @GetMapping("/todos")
  public List<Pedido> listarTodosPedidos(){
	  return pedidoService.listarPedidos();
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<Pedido> buscaPorId(@PathVariable Long id){
	  Pedido pedido = pedidoService.find(id);
	  return ResponseEntity.ok().body(pedido);
  }
  
  @PostMapping()
  public ResponseEntity<Void> insert(@RequestBody Pedido pedido){
	  pedido = pedidoService.insert(pedido);
	  URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(pedido.getId()).toUri();
	  return ResponseEntity.created(uri).build();
  }
  
  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable Long id){
	  pedidoService.delete(id);
	  return ResponseEntity.noContent().build();
  }
  
  @PutMapping("/{id}")
	public ResponseEntity<Pedido> update(@RequestBody Pedido pedido,@PathVariable Long id) {
		try {
		Pedido pedidoSalvo = pedidoService.update(pedido, id);
		return ResponseEntity.ok(pedidoSalvo);
		}
		catch (IllegalArgumentException e){
	          return ResponseEntity.notFound().build();    
	       } 
		
	}
}
