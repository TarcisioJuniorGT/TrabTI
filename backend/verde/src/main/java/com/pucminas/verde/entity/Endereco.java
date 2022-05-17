package com.pucminas.verde.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String logradouro;
	private String estado;
	private String complemento;
	private String bairro;
	private String cidade;
	private int numero;
	private int cep;
	

}
