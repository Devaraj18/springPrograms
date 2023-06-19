package com.dao;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import com.entity.TeacherEntity;

@Repository
public interface TeacherEntityDao {
	
	TeacherEntity createTeacher(TeacherEntity teacherEntity);
	
	TeacherEntity updateTeacher(TeacherEntity teacherEntity);
	
	TeacherEntity fetchTeacher(long id);
	
	Boolean deleteTeacher(long id);
	
	Page<TeacherEntity> fetchTeacherDetails(Integer offset, Integer limit, String Sortby);

}
