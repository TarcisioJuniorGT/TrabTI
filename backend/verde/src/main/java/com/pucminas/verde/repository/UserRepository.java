package com.pucminas.verde.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pucminas.verde.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
