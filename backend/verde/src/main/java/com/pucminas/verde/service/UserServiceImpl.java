package com.pucminas.verde.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.pucminas.verde.dto.UserDto;
import com.pucminas.verde.dto.UserFormDto;
import com.pucminas.verde.entity.User;
import com.pucminas.verde.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ResponseEntity<UserDto> save(UserFormDto userFormDto) {
		
		User user = modelMapper.map(userFormDto, User.class);
		user.setName(userFormDto.getName());
		user.setEmail(userFormDto.getEmail());
		user.setPassword(userFormDto.getPassword());
		
		userRepository.save(user);
		
		return ResponseEntity.status(HttpStatus.CREATED).build();
		
	}

}
