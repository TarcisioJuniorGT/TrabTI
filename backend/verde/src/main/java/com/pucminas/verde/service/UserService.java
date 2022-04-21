package com.pucminas.verde.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pucminas.verde.dto.UserDto;
import com.pucminas.verde.dto.UserFormDto;

@Service
public interface UserService {
	
	ResponseEntity<UserDto> save (UserFormDto userFormDto);

}
