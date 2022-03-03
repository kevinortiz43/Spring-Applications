package com.sample.api.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.sample.api.model.SampleApi;


@Repository
public interface SampleApiRepository extends JpaRepository<SampleApi,Integer>{

	List<SampleApi> findByName(String name);
}
   