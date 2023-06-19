package com.domain;

import java.io.Serializable;

import com.entity.SchoolAddressEntity;
import com.entity.StudentEntity;

public class SchoolDomain implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	private long id;

	private String schoolName;

	private long numberOfSundent;

	private long totalElements;

	private long totalRecords;

	private StudentEntity studentEntity;

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

	public long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}

	public long getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(long totalRecords) {
		this.totalRecords = totalRecords;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
