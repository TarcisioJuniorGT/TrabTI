package com.pucminas.verde.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pucminas.verde.dto.CompanyDto;
import com.pucminas.verde.dto.CompanyFormDto;
import com.pucminas.verde.entity.Company;
import com.pucminas.verde.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public ResponseEntity<CompanyDto> save(CompanyFormDto companyFormDto) {
		
		Company company = modelMapper.map(companyFormDto, Company.class);
		company.setCnpj(companyFormDto.getCnpj());
		company.setEmail(companyFormDto.getEmail());
		company.setEnderecoCompany(companyFormDto.getEnderecoCompany());
		company.setName(companyFormDto.getName());
		company.setPassword(companyFormDto.getPassword());
		
		companyRepository.save(company);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
		
		
	}

}
