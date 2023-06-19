package com.domain;

import java.io.Serializable;
import java.util.List;

import com.entity.SubjectEntity;

public class TeacherDomain implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
     private long id;
	
	private String firstName;
	
	private String lastName;
	
	private long phoneNumber;
	
	private long totalElements;

	private long totalRecords;
	
	private List<SubjectEntity> subjectEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public List<SubjectEntity> getSubjectEntity() {
		return subjectEntity;
	}

	public void setSubjectEntity(List<SubjectEntity> subjectEntity) {
		this.subjectEntity = subjectEntity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	

}
