package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idpedido;
	
	@Column(nullable = false)
	private String loja;
	
	@Column(nullable = false)
	private String unidadeloja;
	
	@Column(nullable = false)
	private String numeroprotocolo;
	
	@Column(nullable = false)
	private String formapagamento;
	
	@Column(nullable = false)
	private Integer parcelas;
	
	@Column(nullable = false)
	private Double valorparcela;
	
	@Column(nullable = false)
	private Double valortotalpedido;
	
	@Column(nullable = false)
	private Date datahora;
	
	@ManyToOne
	@JoinColumn(name="idfuncionario")
	private Funcionario funcionario;
	

	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente cliente;

	public Pedido() {
	}

	public Pedido(Integer idpedido, String loja, String unidadeloja, String numeroprotocolo, String formapagamento,
			Integer parcelas, Double valorparcela, Double valortotalpedido, Date datahora, Funcionario funcionario,
			Cliente cliente) {
		this.idpedido = idpedido;
		this.loja = loja;
		this.unidadeloja = unidadeloja;
		this.numeroprotocolo = numeroprotocolo;
		this.formapagamento = formapagamento;
		this.parcelas = parcelas;
		this.valorparcela = valorparcela;
		this.valortotalpedido = valortotalpedido;
		this.datahora = datahora;
		this.funcionario = funcionario;
		this.cliente = cliente;
	}

	public Integer getIdpedido() {
		return idpedido;
	}

	public void setIdpedido(Integer idpedido) {
		this.idpedido = idpedido;
	}

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getUnidadeloja() {
		return unidadeloja;
	}

	public void setUnidadeloja(String unidadeloja) {
		this.unidadeloja = unidadeloja;
	}

	public String getNumeroprotocolo() {
		return numeroprotocolo;
	}

	public void setNumeroprotocolo(String numeroprotocolo) {
		this.numeroprotocolo = numeroprotocolo;
	}

	public String getFormapagamento() {
		return formapagamento;
	}

	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}

	public Integer getParcelas() {
		return parcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.parcelas = parcelas;
	}

	public Double getValorparcela() {
		return valorparcela;
	}

	public void setValorparcela(Double valorparcela) {
		this.valorparcela = valorparcela;
	}

	public Double getValortotalpedido() {
		return valortotalpedido;
	}

	public void setValortotalpedido(Double valortotalpedido) {
		this.valortotalpedido = valortotalpedido;
	}

	public Date getDatahora() {
		return datahora;
	}

	public void setDatahora(Date datahora) {
		this.datahora = datahora;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
}
