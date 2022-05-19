package com.pucminas.verde.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pucminas.verde.dto.CompanyDto;
import com.pucminas.verde.dto.CompanyFormDto;

@Service
public interface CompanyService {
	
	ResponseEntity<CompanyDto> save (CompanyFormDto companyFormDto);

}
