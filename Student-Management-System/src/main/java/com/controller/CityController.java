package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.CityDomain;
import com.service.CityService;

@RestController
@RequestMapping("/tests")
public class CityController {

	@Autowired
	CityService cityService;

//	@Autowired
//	StateService stateService;

	@PostMapping("/newcity")
	public CityDomain createCity(@Valid @RequestBody CityDomain city) {
		return cityService.createCity(city);
	}

	@PutMapping("/updateCity")
	public CityDomain update(@RequestBody CityDomain city) {
		return cityService.updateCity(city);
	}

	@GetMapping("/getcityDetail/{id}")
	public CityDomain fetchState(@PathVariable long id) {
		return cityService.fetchCity(id);

	}

	@DeleteMapping("/deleteCity/{id}")
	public CityDomain DeleteById(@PathVariable long id) {
		return cityService.deleteCity(id);

	}

	@GetMapping("/getcityDetails")
	public List<CityDomain> fetchAll() {
		return cityService.fetchAll();

	}
}
