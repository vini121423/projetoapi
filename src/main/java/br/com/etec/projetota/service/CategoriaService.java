package br.com.etec.projetota.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.etec.projetota.model.Categoria;
import br.com.etec.projetota.repository.CategoriaRepository;
import br.com.etec.projetota.service.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
  @Autowired
  private CategoriaRepository categoriaRepository;
  
  public List<Categoria> listarCategorias() {
	  return categoriaRepository.findAll(Sort.by(Sort.Direction.ASC,"nome"));
  }
  
  public Categoria find(Integer id) {
	  Optional<Categoria> categoria = categoriaRepository.findById(id);
	  return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Categoria não encontrada ! Id: " + id + " Tipo: " 
		+ Categoria.class.getName()));
  }
  
  public Page<Categoria> pesquisar(String nome, Pageable pageable){
	  return categoriaRepository.findByNomeContaining(nome, pageable);
  }
  
  public Categoria insert(Categoria categoria) {
	  return categoriaRepository.save(categoria);
  }
  
  public Categoria update( Integer id,Categoria categoria) {
	  Categoria categoriaSalva = find(id); 
	  BeanUtils.copyProperties(categoria,categoriaSalva,"id");
	  return categoriaRepository.save(categoriaSalva);
  }
  
  public  void delete(Integer id) {
   find(id);
   categoriaRepository.deleteById(id);
  }
  
  
  
}
