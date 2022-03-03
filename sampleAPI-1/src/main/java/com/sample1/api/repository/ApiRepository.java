package com.sample1.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sample1.api.model.api;

@Repository
public interface ApiRepository extends JpaRepository<api, Integer> {

	List<api> findByFirstName(String firstName);

}
