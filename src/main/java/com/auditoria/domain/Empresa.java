package com.auditoria.domain;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Empresa {
	
	private Integer id;
	private String nomeEmpresa;
	private String cnpj;
	private String endereco;
	private Integer telefone;
	private String auditor;
	private String data;
	
	
	public Empresa() {
		super();
	}

	public Empresa(Integer id, String nomeEmpresa, String cnpj, String endereco, Integer telefone, String auditor,
			String data) {
		super();
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
		this.auditor = auditor;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(auditor, cnpj, data, endereco, id, nomeEmpresa, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(auditor, other.auditor) && Objects.equals(cnpj, other.cnpj)
				&& Objects.equals(data, other.data) && Objects.equals(endereco, other.endereco)
				&& Objects.equals(id, other.id) && Objects.equals(nomeEmpresa, other.nomeEmpresa)
				&& Objects.equals(telefone, other.telefone);
	}
	
	
	
	
	

}
