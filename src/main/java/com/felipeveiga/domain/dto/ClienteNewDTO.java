package com.felipeveiga.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.felipeveiga.services.validation.ClienteInsert;

@ClienteInsert
public class ClienteNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Campo nome não pode ser vazio")
	@Length(min = 5, max =120, message = "O tamnho deve ser entre 5 e 80 caracteres")
	private String nome;
	
	@Email(message = "Email inválido")
	@NotEmpty(message = "Campo email não pode ser vazio")
	@Length(min = 5, max =80, message = "O tamnho deve ser entre 5 e 80 caracteres")
	private String email;
	
	@NotEmpty(message = "Campo Cpf ou Cnpf não pode ser vazio")
	private String cpfOuCnpj;
	
	private Integer tipo;
	
	@NotEmpty(message = "Campo senha não pode ser vazio")
	private String senha;
	
	@NotEmpty(message = "Campo logradouro não pode ser vazio")
	private String logradouro;
	
	@NotEmpty(message = "Campo numero não pode ser vazio")
	private String numero;
	private String complemento;
	
	@NotEmpty(message = "Campo bairro não pode ser vazio")
	private String bairro;
	
	@NotEmpty(message = "Campo email não pode ser vazio")
	private String cep;
	
	@NotEmpty(message = "Campo telefone não pode ser vazio")
	private String telefone1;
	private String telefone2;
	private String telefone3;
	
	private Integer cidadeId;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}
	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public String getTelefone3() {
		return telefone3;
	}
	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}
	public Integer getCidadeId() {
		return cidadeId;
	}
	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}
	
	public ClienteNewDTO() {
		super();
	}
	
	
	
}
