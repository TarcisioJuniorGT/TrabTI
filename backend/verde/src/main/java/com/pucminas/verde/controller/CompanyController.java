package com.pucminas.verde.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pucminas.verde.dto.CompanyDto;
import com.pucminas.verde.dto.CompanyFormDto;
import com.pucminas.verde.service.CompanyService;

@RestController
@RequestMapping("/cadastro/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping
	@Transactional
	public ResponseEntity<CompanyDto> save (@Valid @RequestBody CompanyFormDto companyFormDto){
		return this.companyService.save(companyFormDto);
	}

}
