package com.sample1.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample1.api.model.*;
import com.sample1.api.repository.*;
import com.sample1.api.exception.*;

@RestController
@RequestMapping("/api/")
public class ApiController {

	@Autowired
	private ApiRepository apiRepo;

	@GetMapping("/allapi")
	public List<api> getAllApi() {
		return apiRepo.findAll();
	}

	@PostMapping("/addapi")
	public api newApi(@RequestBody api api) {
		return apiRepo.save(api);

	}

	@GetMapping("/apiId/{id}")
	public ResponseEntity<api> getApiById(@PathVariable int id) {
		api api = apiRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("api not found"));
		return ResponseEntity.ok(api);

	}

	@GetMapping("/apiName/{firstName}")
	public List<api> getApiByName(@PathVariable String firstName) {

		List<api> api = apiRepo.findByFirstName(firstName);
		if (api.isEmpty()) {
			System.out.println(new ResourceNotFoundException("Api with the name + " + firstName + "not found"));
		}
		return apiRepo.findByFirstName(firstName);
	}

	@PutMapping("/apiId/{id}")
	public ResponseEntity<api> updateApi(@PathVariable int id, @RequestBody api api) {
		api apiId = apiRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("api not found"));
		apiId.setFirstName(api.getFirstName());
		api updatedApi = apiRepo.save(apiId);
		return ResponseEntity.ok(updatedApi);

	}

	@DeleteMapping("/api/{id}")
	public String deleteApi(@PathVariable int id) {
		apiRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student Not found"));
		apiRepo.deleteById(id);
		return "The student with id: " + id + " is removed from the database.";
	}

}
