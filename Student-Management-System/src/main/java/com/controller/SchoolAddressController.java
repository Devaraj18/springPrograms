package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.SchoolAddressDomain;
import com.service.SchoolAddressService;
import com.service.SchoolService;

@RestController
public class SchoolAddressController 
{
	@Autowired
	SchoolAddressService schoolAddressService;

	@Autowired
	SchoolService schoolService;

	@PostMapping("/newSchoolAddress")
	public SchoolAddressDomain createStudent(@RequestBody SchoolAddressDomain schoolAddress) {
		return schoolAddressService.createSchoolAddress(schoolAddress);
	}

	@PutMapping("/updateSchoolAddress")
	public SchoolAddressDomain update(@RequestBody SchoolAddressDomain studentAddress) {
		return schoolAddressService.updateSchoolAddress(studentAddress);
	}

	@GetMapping("/getSchoolAddressDetails/{id}")
	public SchoolAddressDomain fetchSchoolAddress(@PathVariable long id) {
		return schoolAddressService.fetchSchoolAddress(id);
	}

	@DeleteMapping("/deleteStudentAddreess/{id}")
	public SchoolAddressDomain DeleteById(@PathVariable long id) {
		return schoolAddressService.deleteSchoolAddress(id);
	}

}
