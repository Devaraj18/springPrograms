package com.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.domain.SchoolDomain;
import com.repository.SchoolEntityRepository;
import com.service.SchoolAddressService;
import com.service.SchoolService;

@RestController
public class SchoolController
{
	@Autowired
	SchoolService schoolService;

	@Autowired
	SchoolAddressService schoolAddressService;

	@Autowired
	SchoolEntityRepository schoolEntityRepository;

	private Sort.Direction getSortDirection(String direction) {
		if (direction.equals("asc")) {
			return Sort.Direction.ASC;
		} else if (direction.equals("desc")) {
			return Sort.Direction.DESC;
		}

		return Sort.Direction.ASC;
	}

	@PostMapping("/newSchool")
	public SchoolDomain createSchool(@Valid @RequestBody SchoolDomain schoolDomain) {
		return schoolService.createSchool(schoolDomain);
	}

	@PutMapping("/updateSchool")
	public SchoolDomain updateSchool(@RequestBody SchoolDomain studentDomain) {
		return schoolService.updateSchool(studentDomain);
	}

	@GetMapping("/getSchoolDetail/{id}")
	public SchoolDomain fetchSchool(@PathVariable long id) {
		return schoolService.fetchSchool(id);

	}

	@DeleteMapping("/deleteSchool/{id}")
	public Boolean DeleteById(@PathVariable long id) {
		return schoolService.deleteSchool(id);

	}

	@GetMapping("/fetchAll")
	public List<SchoolDomain> fetchall(@RequestParam(name = "offSet", defaultValue = "1") Integer offset,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer limit,
			@RequestParam(name = "Sortby") String Sortby) {
		return schoolService.fetchSchoolDetails(offset, limit, Sortby);

	}


}
