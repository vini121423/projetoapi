package br.com.etec.projetota.repository.filter;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class PedidoFilter {
	private String nome;

	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dataPedidoDe;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dataPedidoAte;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataPedidoDe() {
		return dataPedidoDe;
	}

	public void setDataPedidoDe(LocalDate dataPedidoDe) {
		this.dataPedidoDe = dataPedidoDe;
	}

	public LocalDate getDataPedidoAte() {
		return dataPedidoAte;
	}

	public void setDataPedidoAte(LocalDate dataPedidoAte) {
		this.dataPedidoAte = dataPedidoAte;
	}

}
