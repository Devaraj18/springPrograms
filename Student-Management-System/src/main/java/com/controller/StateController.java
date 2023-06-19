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

import com.domain.StateDomain;
import com.service.CityService;
import com.service.StateService;

@RestController
@RequestMapping("/tests")
public class StateController {

	@Autowired
	StateService stateService;

	@Autowired
	CityService cityService;

	@PostMapping("/newState")
	public StateDomain createStudent(@Valid @RequestBody StateDomain state) {
		return stateService.createState(state);
	}

	@PutMapping("/updateState")
	public StateDomain update(@RequestBody StateDomain state) {
		return stateService.updateState(state);
	}

	@GetMapping("/getStateDetail/{id}")
	public StateDomain fetchState(@PathVariable long id) {
		return stateService.fetchState(id);

	}

	@DeleteMapping("/deleteState/{id}")
	public StateDomain DeleteById(@PathVariable long id) {
		return stateService.deleteState(id);

	}

	@GetMapping("/getStateDetails")
	public List<StateDomain> fetchAll() {
		return stateService.fetchAll();
	}
}
