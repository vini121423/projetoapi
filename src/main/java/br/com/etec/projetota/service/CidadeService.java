package br.com.etec.projetota.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.etec.projetota.model.Cidade;
import br.com.etec.projetota.repository.CidadeRepository;
import br.com.etec.projetota.service.exceptions.ObjectNotFoundException;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository cidadeRepository;

	public List<Cidade> listarCidades() {
		return cidadeRepository.findAll();  
	}
	
	public Page<Cidade> pesquisar(String nome, Pageable pageable) {
		return cidadeRepository.findByNomeContaining(nome, pageable);
	}
	
	public Cidade find(Integer id) {
		Optional<Cidade> cidade = cidadeRepository.findById(id);
		return cidade.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado ! Id: " + id + " Tipo: " 
		+ Cidade.class.getName()));
	}
	
	public Cidade insert(Cidade cidade) {
		return cidadeRepository.save(cidade);
	}
	
	public Cidade update(Cidade cidade) {
		find(cidade.getId());
		return cidadeRepository.save(cidade);
	}
	
	public void delete(Integer id) {
		find(id);
		cidadeRepository.deleteById(id);
	}
}
