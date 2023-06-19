package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUBJECT")
public class SubjectEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SUBJECT_ID")
	private long id;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	@ManyToOne
	private TeacherEntity teacherEntity;

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

	public TeacherEntity getTeacherEntity() {
		return teacherEntity;
	}

	public void setTeacherEntity(TeacherEntity teacherEntity) {
		this.teacherEntity = teacherEntity;
	}

	public SubjectEntity(long id, String subjectName, TeacherEntity teacherEntity) {
		super();
		this.id = id;
		this.subjectName = subjectName;
		this.teacherEntity = teacherEntity;
	}

	public SubjectEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
