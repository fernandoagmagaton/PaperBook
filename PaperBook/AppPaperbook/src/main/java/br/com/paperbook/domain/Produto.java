package br.com.paperbook.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idproduto;
	@Column
	private String nomeproduto;
	@Column
	private String descricaoproduto;
	@Column
	private String codigobarras;
	@Column
	private Double preco;
	@Column
	private String observacao;
	@OneToOne
	@JoinColumn(name="idcategoria")
	private Categoria categoria;
	@OneToOne
	@JoinColumn(name="idfornecedor")
	private Fornecedor fornecedor;
	@OneToOne
	@JoinColumn(name="idlote")
	private Lote lote;

	public Produto() {
	}

	public Produto(Integer idproduto, String nomeproduto, String descricaoproduto, String codigobarras, Double preco,
			String observacao, Categoria categoria, Fornecedor fornecedor, Lote lote) {
		this.idproduto = idproduto;
		this.nomeproduto = nomeproduto;
		this.descricaoproduto = descricaoproduto;
		this.codigobarras = codigobarras;
		this.preco = preco;
		this.observacao = observacao;
		this.categoria = categoria;
		this.fornecedor = fornecedor;
		this.lote = lote;
	}

	public Integer getIdproduto() {
		return idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		this.idproduto = idproduto;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public String getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	public String getCodigobarras() {
		return codigobarras;
	}

	public void setCodigobarras(String codigobarras) {
		this.codigobarras = codigobarras;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}
	
	
}
