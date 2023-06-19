package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="SCHHOOL")

public class SchoolEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="SCHOOL_ID")
	private long id;
	
	@Column(name="SCHOOL_NAME")
	private String schoolName;
	
	@Column(name="NUMBER_OF_STUDENT")
	private long numberOfSundent;
	
	@OneToOne(cascade = CascadeType.ALL)
	private StudentEntity studentEntity;
	
	@OneToOne(cascade = CascadeType.ALL)
	private SchoolAddressEntity schoolAddressEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public long getNumberOfSundent() {
		return numberOfSundent;
	}

	public void setNumberOfSundent(long numberOfSundent) {
		this.numberOfSundent = numberOfSundent;
	}

	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}

	public SchoolAddressEntity getSchoolAddressEntity() {
		return schoolAddressEntity;
	}

	public void setSchoolAddressEntity(SchoolAddressEntity schoolAddressEntity) {
		this.schoolAddressEntity = schoolAddressEntity;
	}

	public SchoolEntity(long id, String schoolName, long numberOfSundent, StudentEntity studentEntity,
			SchoolAddressEntity schoolAddressEntity) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.numberOfSundent = numberOfSundent;
		this.studentEntity = studentEntity;
		this.schoolAddressEntity = schoolAddressEntity;
	}

	public SchoolEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SchoolEntity [id=" + id + ", schoolName=" + schoolName + ", numberOfSundent=" + numberOfSundent
				+ ", studentEntity=" + studentEntity + ", schoolAddressEntity=" + schoolAddressEntity + "]";
	}




}
