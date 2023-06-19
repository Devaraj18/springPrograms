package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.StudentAddressDomain;
import com.service.StudentAddressService;
import com.service.StudentService;

@RestController
@RequestMapping("/tests")
public class StudentAddressController {

	@Autowired
	StudentAddressService studentAddressService;

	@Autowired
	StudentService studentService;

	@PostMapping("/newStudentAddress")
	public StudentAddressDomain createStudent(@RequestBody StudentAddressDomain studentAddress) {
		return studentAddressService.createStudentAddress(studentAddress);
	}

	@PutMapping("/updateStudentAddress")
	public StudentAddressDomain update(@RequestBody StudentAddressDomain studentAddress) {
		return studentAddressService.updateStudentAddress(studentAddress);
	}

	@GetMapping("/getStudentAddressDetails/{id}")
	public StudentAddressDomain fetchStudetAddress(@PathVariable long id) {
		return studentAddressService.fetchStudentAddress(id);
	}

	@DeleteMapping("/deleteStudentAddreess/{id}")
	public Boolean DeleteById(@PathVariable long id) {
		return studentAddressService.deleteStudentAddress(id);
	}

}
