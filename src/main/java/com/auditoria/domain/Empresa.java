package com.auditoria.domain;

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
	

}
