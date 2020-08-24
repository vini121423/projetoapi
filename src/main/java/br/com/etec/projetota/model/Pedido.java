package br.com.etec.projetota.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="pedido")
public class Pedido {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private LocalDate datapedido;
	private BigDecimal valorpedido;
	
	
	
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente cliente;
	
	
	@JsonIgnore()
	@OneToMany(mappedBy="pedido", cascade = CascadeType.ALL)
	private List<Itempedido> itens = new ArrayList<>();



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public LocalDate getDatapedido() {
		return datapedido;
	}



	public void setDatapedido(LocalDate datapedido) {
		this.datapedido = datapedido;
	}



	public BigDecimal getValorpedido() {
		return valorpedido;
	}



	public void setValorpedido(BigDecimal valorpedido) {
		this.valorpedido = valorpedido;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public List<Itempedido> getItens() {
		return itens;
	}



	public void setItens(List<Itempedido> itens) {
		this.itens = itens;
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
		Pedido other = (Pedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

    
	

	
}
