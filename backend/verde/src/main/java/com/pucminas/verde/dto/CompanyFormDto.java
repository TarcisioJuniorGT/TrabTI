package com.pucminas.verde.dto;


import com.pucminas.verde.entity.Endereco;

import lombok.Data;

@Data
public class CompanyFormDto {
	
	private String name;
	private String email;
	private String password;
	private Endereco enderecoCompany;
	private String cnpj;

}
