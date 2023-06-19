package com.domain;

import java.io.Serializable;

import com.entity.TeacherEntity;


public class SubjectDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	private long id;

	private String subjectName;
	
	private TeacherEntity teacherEntity;


	public TeacherEntity getTeacherEntity() {
		return teacherEntity;
	}

	public void setTeacherEntity(TeacherEntity teacherEntity) {
		this.teacherEntity = teacherEntity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
