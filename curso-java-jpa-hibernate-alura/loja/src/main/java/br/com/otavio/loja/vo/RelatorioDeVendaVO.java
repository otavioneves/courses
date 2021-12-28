package br.com.otavio.loja.vo;

import java.time.LocalDate;

public class RelatorioDeVendaVO {

	private String nomeProduto;
	private long quantidadeVendida;
	private LocalDate dataUltimaVenda;

	public RelatorioDeVendaVO(String nomeProduto, long quantidadeVendida, LocalDate dataUltimaVenda) {
		super();
		this.nomeProduto = nomeProduto;
		this.quantidadeVendida = quantidadeVendida;
		this.dataUltimaVenda = dataUltimaVenda;
	}
	
	

	@Override
	public String toString() {
		return "RelatorioDeVendaVO [nomeProduto=" + nomeProduto + ", quantidadeVendida=" + quantidadeVendida
				+ ", dataUltimaVenda=" + dataUltimaVenda + "]";
	}



	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public long getQuantidadeVendida() {
		return quantidadeVendida;
	}

	public void setQuantidadeVendida(long quantidadeVendida) {
		this.quantidadeVendida = quantidadeVendida;
	}

	public LocalDate getDataUltimaVenda() {
		return dataUltimaVenda;
	}

	public void setDataUltimaVenda(LocalDate dataUltimaVenda) {
		this.dataUltimaVenda = dataUltimaVenda;
	}

}
