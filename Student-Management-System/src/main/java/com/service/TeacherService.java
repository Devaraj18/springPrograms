package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.domain.TeacherDomain;

@Service
public interface TeacherService {
	
	TeacherDomain createTeacher(TeacherDomain teacherDomain);
	
	TeacherDomain updateTeacher(TeacherDomain teacherDomain);
	
	TeacherDomain fetchTeacher(long id);
	
	Boolean deleteTeacher(long id);
	
	List<TeacherDomain> fetchTeacherDetails(Integer offset,Integer limit,String sortby);
	
	

}
