package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.SubjectDomain;
import com.service.SubjectService;
import com.service.TeacherService;

@RestController
public class SubjectController {
	
	@Autowired
	SubjectService subjectService;

	@Autowired
	TeacherService teacherService;

	@PostMapping("/newSubject")
	public SubjectDomain createStudent(@RequestBody SubjectDomain subject) {
		return subjectService.createSubject(subject);
	}

	@PutMapping("/updateSubject")
	public SubjectDomain update(@RequestBody SubjectDomain subject) {
		return subjectService.updateSubject(subject);
	}

	@GetMapping("/getSubjectDetail/{id}")
	public SubjectDomain fetchStudetAddress(@PathVariable long id) {
		return subjectService.fetchSubject(id);
	}

	@DeleteMapping("/deleteSubject/{id}")
	public Boolean DeleteById(@PathVariable long id) {
		return subjectService.deleteSubject(id);
	}


}
