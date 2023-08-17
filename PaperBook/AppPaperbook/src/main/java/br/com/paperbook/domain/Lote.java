package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Lote {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idlote;
	
	@Column
	private String numerolote;
	
	@Column
	private Date fabricacao;
	
	@Column
	private Date validade;

	public Lote() {
	}

	public Lote(Integer idlote, String numerolote, Date fabricacao, Date validade) {
		this.idlote = idlote;
		this.numerolote = numerolote;
		this.fabricacao = fabricacao;
		this.validade = validade;
	}

	public Integer getIdlote() {
		return idlote;
	}

	public void setIdlote(Integer idlote) {
		this.idlote = idlote;
	}

	public String getNumerolote() {
		return numerolote;
	}

	public void setNumerolote(String numerolote) {
		this.numerolote = numerolote;
	}

	public Date getFabricacao() {
		return fabricacao;
	}

	public void setFabricacao(Date fabricacao) {
		this.fabricacao = fabricacao;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}
	
	

}
