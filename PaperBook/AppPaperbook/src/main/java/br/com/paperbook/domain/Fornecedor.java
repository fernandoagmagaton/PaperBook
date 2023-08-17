package br.com.paperbook.domain;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Fornecedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idfornecedor;
	@Column
	private String razaosocial;
	@Column
	private String cnpj;
	@Column
	private String tipoproduto;
	@OneToOne
	@JoinColumn(name="idendereco")
	private Endereco endereco;
	@OneToOne
	@JoinColumn(name="idcontato")
	private Contato contato;
	
	

	public Fornecedor() {
	}

	public Fornecedor(Integer idfornecedor, String razaosocial, String cnpj, String tipoproduto, Endereco endereco,
			Contato contato) {
		this.idfornecedor = idfornecedor;
		this.razaosocial = razaosocial;
		this.cnpj = cnpj;
		this.tipoproduto = tipoproduto;
		this.endereco = endereco;
		this.contato = contato;
	}

	public Integer getIdfornecedor() {
		return idfornecedor;
	}

	public void setIdfornecedor(Integer idfornecedor) {
		this.idfornecedor = idfornecedor;
	}

	public String getRazaosocial() {
		return razaosocial;
	}

	public void setRazaosocial(String razaosocial) {
		this.razaosocial = razaosocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTipoproduto() {
		return tipoproduto;
	}

	public void setTipoproduto(String tipoproduto) {
		this.tipoproduto = tipoproduto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contato getContato() {
		return contato;
	}

	public void setContato(Contato contato) {
		this.contato = contato;
	}

	

}
