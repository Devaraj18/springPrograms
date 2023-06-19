package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.entity.StudentEntity;
import com.entity.TeacherEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.TeacherEntityRepository;

@Repository
public class TeacherEntityDaoImp implements TeacherEntityDao{

	@Autowired
	TeacherEntityRepository teacherEntityRepository;
	
	@Override
	public TeacherEntity createTeacher(TeacherEntity teacherEntity) {
		return teacherEntityRepository.saveAndFlush(teacherEntity);
	}

	@Override
	public TeacherEntity updateTeacher(TeacherEntity teacherEntity) {
		TeacherEntity entity = teacherEntityRepository.findById(teacherEntity.getId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("Teacher Entity is not Available please checkout..");
		}
		return teacherEntityRepository.saveAndFlush(teacherEntity);
	}


	@Override
	public TeacherEntity fetchTeacher(long id) {
		return teacherEntityRepository.findById( id).orElse(null);
	}

	@Override
	public Boolean deleteTeacher(long id) {
		Boolean b= false;
		TeacherEntity teacher = fetchTeacher(id);
		if(teacher==null) {
		throw new StudentNotFoundException("Teacher is null ..");
		}
		else {
			teacherEntityRepository.deleteById(id);
		b = true;
		}
	
		return b;
	}

	
	@Override
	public Page<TeacherEntity> fetchTeacherDetails(Integer offset, Integer limit, String Sortby) {
		Pageable pageable = PageRequest.of(offset, limit, Sort.by("id").descending());
		return teacherEntityRepository.findAll(pageable);
	}

}
