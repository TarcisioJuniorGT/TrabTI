package com.pucminas.verde.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pucminas.verde.dto.UserDto;
import com.pucminas.verde.dto.UserFormDto;
import com.pucminas.verde.service.UserService;

@RestController
@RequestMapping("/login")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping
	@Transactional
	public ResponseEntity<UserDto> save (@Valid @RequestBody UserFormDto userFormDto){
		return this.userService.save(userFormDto);
	}
	

}
