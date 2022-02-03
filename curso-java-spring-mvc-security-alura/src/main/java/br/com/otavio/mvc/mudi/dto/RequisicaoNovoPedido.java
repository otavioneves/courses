package br.com.otavio.mvc.mudi.dto;
// uma classe DTO, Data Transfer Object, é uma classe que serve apenas para transferir objetos


import javax.validation.constraints.NotBlank;

import br.com.otavio.mvc.mudi.model.Pedido;
import br.com.otavio.mvc.mudi.model.StatusPedido;

public class RequisicaoNovoPedido {

	// o nome dos atributos da classe tem que ter os mesmos names dos inputs
	
	@NotBlank
	private String nomeProduto;
	@NotBlank
	private String urlProduto;
	@NotBlank
	private String urlImagem;
	private String descricao;
	
	public Pedido toPedido() {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeProduto);
		pedido.setUrlProduto(urlProduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setDescricao(descricao);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		
		return pedido;
	} 
	
	
	
	
	public RequisicaoNovoPedido() {
	}




	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	
}
