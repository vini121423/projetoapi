package br.com.etec.projetota.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="produto")
public class Produto {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private Integer id;
  
  @NotNull
  @Size(max = 100)
  private String nome;
  
  @NotNull
  private BigDecimal preco;
  
  @ManyToOne
  @JoinColumn(name="idcategoria")
  private Categoria categoria;

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public BigDecimal getPreco() {
	return preco;
}

public void setPreco(BigDecimal preco) {
	this.preco = preco;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Produto other = (Produto) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	return true;
}
  
  
  
}
