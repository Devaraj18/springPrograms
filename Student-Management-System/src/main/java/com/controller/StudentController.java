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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.domain.StudentDomain;
import com.service.StudentAddressService;
import com.service.StudentService;

@RestController
@RequestMapping("/tests")
public class StudentController {

	@Autowired
	StudentService studentService;

	@Autowired
	StudentAddressService studentAddressService;

	private Sort.Direction getSortDirection(String direction) {
		if (direction.equals("asc")) {
			return Sort.Direction.ASC;
		} else if (direction.equals("desc")) {
			return Sort.Direction.DESC;
		}

		return Sort.Direction.ASC;
	}

	@PostMapping("/newStudent")
	public StudentDomain createStudent(@Valid @RequestBody StudentDomain student) {
		return studentService.createStudent(student);
	}

	@PutMapping("/updateStudent")
	public StudentDomain update(@RequestBody StudentDomain student) {
		return studentService.updateStudent(student);
	}

	@GetMapping("/getStudentDetail/{id}")
	public StudentDomain fetchStudent(@PathVariable long id) {
		return studentService.fetchStudent(id);

	}

	@DeleteMapping("/deleteStudent/{id}")
	public Boolean DeleteById(@PathVariable long id) {
		return studentService.deleteStudent(id);

	}

	@GetMapping("/fetchAll")
	public List<StudentDomain> fetchall(@RequestParam(name = "offSet", defaultValue = "1") Integer offset,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer limit,
			@RequestParam(name = "Sortby") String Sortby) {
		return studentService.fetchStudentDetails(offset, limit, Sortby);

	}

}
