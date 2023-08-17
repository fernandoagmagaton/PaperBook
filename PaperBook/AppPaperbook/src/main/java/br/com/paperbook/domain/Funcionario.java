package br.com.paperbook.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idfuncionario;
	
	@Column(nullable = false)
	private String nomefuncionario;
	
	@Column(nullable = false, unique = true)
	private String cpffuncionario;
	
	@Column(nullable = false, unique = true)
	private String rgfuncionario;
	
	@Column(nullable = false)
	private String sexofuncionario;
	
	@Column(nullable = false)
	private Date datanascimentofuncionario;
	
	@Column(nullable = false)
	private Integer superior;
	
	@OneToOne
	@JoinColumn(name="idcargo")
	private Cargo cargo;
	
	@OneToOne
	@JoinColumn(name="idendereco")
	private Endereco endereco;
	

	@OneToOne
	@JoinColumn(name="idcontato")
	private Contato contato;
	

	@OneToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public Funcionario() {
	}

	public Funcionario(Integer idfuncionario, String nomefuncionario, String cpffuncionario, String rgfuncionario,
			String sexofuncionario, Date datanascimentofuncionario, Integer superior, Cargo cargo,
			Endereco endereco, Contato contato, Usuario usuario) {
		this.idfuncionario = idfuncionario;
		this.nomefuncionario = nomefuncionario;
		this.cpffuncionario = cpffuncionario;
		this.rgfuncionario = rgfuncionario;
		this.sexofuncionario = sexofuncionario;
		this.datanascimentofuncionario = datanascimentofuncionario;
		this.superior = superior;
		this.cargo = cargo;
		this.endereco = endereco;
		this.contato = contato;
		this.usuario = usuario;
	}

	public Integer getIdfuncionario() {
		return idfuncionario;
	}

	public void setIdfuncionario(Integer idfuncionario) {
		this.idfuncionario = idfuncionario;
	}

	public String getNomefuncionario() {
		return nomefuncionario;
	}

	public void setNomefuncionario(String nomefuncionario) {
		this.nomefuncionario = nomefuncionario;
	}

	public String getCpffuncionario() {
		return cpffuncionario;
	}

	public void setCpffuncionario(String cpffuncionario) {
		this.cpffuncionario = cpffuncionario;
	}

	public String getRgfuncionario() {
		return rgfuncionario;
	}

	public void setRgfuncionario(String rgfuncionario) {
		this.rgfuncionario = rgfuncionario;
	}

	public String getSexofuncionario() {
		return sexofuncionario;
	}

	public void setSexofuncionario(String sexofuncionario) {
		this.sexofuncionario = sexofuncionario;
	}

	public Date getDatanascimentofuncionario() {
		return datanascimentofuncionario;
	}

	public void setDatanascimentofuncionario(Date datanascimentofuncionario) {
		this.datanascimentofuncionario = datanascimentofuncionario;
	}

	public Integer getSuperior() {
		return superior;
	}

	public void setSuperior(Integer superior) {
		this.superior = superior;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
