package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.dao.StudentEntityDao;
import com.dao.TeacherEntityDao;
import com.domain.StudentDomain;
import com.domain.TeacherDomain;
import com.entity.StudentEntity;
import com.entity.TeacherEntity;
import com.objectcopier.ObjectCopier;

@Service
public class TeacherServiceImp implements TeacherService{

	@Autowired
	TeacherEntityDao teacherEntityDao;

	@Transactional
	public TeacherDomain createTeacher(TeacherDomain teacherDomain) {

		return toDomain(teacherEntityDao.createTeacher(toEntity(teacherDomain)));
	}

	@Transactional
	public TeacherDomain updateTeacher(TeacherDomain teacherDomain) {

		return toDomain(teacherEntityDao.updateTeacher(toEntity(teacherDomain)));
	}

	public TeacherDomain fetchTeacher(long id) {

		return toDomain(teacherEntityDao.fetchTeacher(id));
	}

	@Transactional
	public Boolean deleteTeacher(long id) {

		return teacherEntityDao.deleteTeacher(id);
	}

	// making To Domain method

	private TeacherDomain toDomain(TeacherEntity teacherEntity) {
		TeacherDomain domain = null;
		if (teacherEntity != null) {
			domain = new com.domain.TeacherDomain();
			ObjectCopier.copyObject(teacherEntity, domain);
		}
		return domain;
	}

	// making to Entity method
	private TeacherEntity toEntity(TeacherDomain teacherDomain) {
		TeacherEntity entity = null;
		if (teacherDomain != null) {
			entity = new com.entity.TeacherEntity();
			ObjectCopier.copyObject(teacherDomain, entity);
		}

		return entity;
	}

	@Override
	public List<TeacherDomain> fetchTeacherDetails(Integer offset, Integer limit, String Sortby) {
		Page<com.entity.TeacherEntity> page = teacherEntityDao.fetchTeacherDetails(--offset, limit, Sortby);
		List<TeacherDomain> list = new ArrayList<>();
		page.forEach(teacherDetails -> {
			TeacherDomain domain = toDomain(teacherDetails);
			domain.setTotalRecords(page.getTotalElements());
			list.add(domain);
		});
		return list;
	}
}