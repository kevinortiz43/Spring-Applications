package com.example.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.example.entity.userEntity;

public interface serviceImpl {

	List<userEntity> getUsersByUsername(String user);

	Optional<userEntity> getUsernameById(Long id);

	void updateUser(userEntity user);

	void deleteUser(Long id);

	void saveUser(userEntity user);

	void addUser(userEntity user);

}
