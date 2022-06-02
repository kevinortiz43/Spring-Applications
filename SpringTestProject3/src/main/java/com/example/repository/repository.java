package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.userEntity;

import java.util.List;

public interface repository extends JpaRepository<userEntity, Long>{

	List<userEntity> findByUserName(String user);
	
	
}
