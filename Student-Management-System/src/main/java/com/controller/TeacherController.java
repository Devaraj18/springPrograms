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

import com.domain.TeacherDomain;
import com.repository.TeacherEntityRepository;
import com.service.SubjectService;
import com.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	TeacherService teacherService;

	@Autowired
	SubjectService subjectService;

	@Autowired
	TeacherEntityRepository teacherEntityRepository;

	private Sort.Direction getSortDirection(String direction) {
		if (direction.equals("asc")) {
			return Sort.Direction.ASC;
		} else if (direction.equals("desc")) {
			return Sort.Direction.DESC;
		}

		return Sort.Direction.ASC;
	}

	@PostMapping("/newTeacher")
	public TeacherDomain createTeacher(@Valid @RequestBody TeacherDomain teacher) {
		return teacherService.createTeacher(teacher);
	}

	@PutMapping("/updateTeacher")
	public TeacherDomain update(@RequestBody TeacherDomain student) {
		return teacherService.updateTeacher(student);
	}

	@GetMapping("/getTeacherDetail/{id}")
	public TeacherDomain fetchStudent(@PathVariable long id) {
		return teacherService.fetchTeacher(id);

	}

	@DeleteMapping("/deleteTeacher/{id}")
	public Boolean DeleteById(@PathVariable long id) {
		return teacherService.deleteTeacher(id);

	}

	@GetMapping("/fetchAllTeacher")
	public List<TeacherDomain> fetchall(@RequestParam(name = "offSet", defaultValue = "1") Integer offset,
			@RequestParam(name = "pageSize", defaultValue = "10") Integer limit,
			@RequestParam(name = "Sortby") String Sortby) {
		return teacherService.fetchTeacherDetails(offset, limit, Sortby);

	}

}

