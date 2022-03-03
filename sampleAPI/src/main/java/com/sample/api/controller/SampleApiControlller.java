package com.sample.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.api.model.SampleApi;
import com.sample.api.repository.SampleApiRepository;

import com.sample.api.exception.SampleApiException;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/")
public class SampleApiControlller {

	@Autowired
	private SampleApiRepository ApiRepository;

	// get all students

	@GetMapping("/allsamples")
	public List<SampleApi> getAllSamples() {

		return ApiRepository.findAll();
	}

	@PostMapping("/addsamples")
	public SampleApi newSampleApi(@RequestBody SampleApi sapi) {

		return ApiRepository.save(sapi);
	}

	@GetMapping("/samples/{id}")
	public ResponseEntity<SampleApi> getStudentById(@PathVariable int id) {
		SampleApi samp = ApiRepository.findById(id).orElseThrow(() -> new SampleApiException("Sample not found"));
		return ResponseEntity.ok(samp);
	}

	@GetMapping("/samples/{name}")
	public List<SampleApi> getSamplesByName(@PathVariable String name) {
//		 return ApiRepository.findByName(name);

		List<SampleApi> samples = ApiRepository.findByName(name);
		if (samples.isEmpty()) {
			System.out.println(new SampleApiException("samples with the name " + name + " not found"));
		}

		return ApiRepository.findByName(name);
	}

	@PutMapping("/putsamples/{id}")
	public ResponseEntity<SampleApi> updateStudent(@PathVariable int id, @RequestBody SampleApi sample) {
		SampleApi s = ApiRepository.findById(id).orElseThrow(() -> new SampleApiException("sample not found"));
		s.setFirst_name(sample.getFirst_name());
//		s.setLast_name(sample.getLast_name());
		SampleApi updatedSamples = ApiRepository.save(s);
		return ResponseEntity.ok(updatedSamples);
	}

	@DeleteMapping("deletesamples/{id}")
	public String deleteStudent(@PathVariable int id) {
		ApiRepository.findById(id).orElseThrow(() -> new SampleApiException("Student not found"));
		ApiRepository.deleteById(id);
		return "The student with id: " + id + " is removed from the database.";
	}

}
