package com.pucminas.verde.dto;

import com.pucminas.verde.entity.Endereco;

import lombok.Data;

@Data
public class UserFormDto {
	
	private String name;
	private String email;
	private String password;
	private String cpf;
	private Endereco enderecoUser;
	

}
