package com.example.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.userEntity;
import com.example.repository.repository;

@Service
public class UserService implements serviceImpl {

	@Autowired
	private repository repo;

	@Override
	public List<userEntity> getUsersByUsername(String user) {
		// TODO Auto-generated method stub
		return repo.findByUserName(user);
	}

	@Override
	public Optional<userEntity> getUsernameById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void updateUser(userEntity user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	@Override
	public void addUser(userEntity user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		Optional<userEntity> user = repo.findById(id);
		if (user.isPresent()) {
			repo.delete(user.get());
		}
	}

	@Override
	public void saveUser(userEntity user) {
		// TODO Auto-generated method stub
		repo.save(user);
	}


}
