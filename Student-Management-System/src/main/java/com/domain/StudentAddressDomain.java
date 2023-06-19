package com.domain;

import java.io.Serializable;

import com.entity.StateEntity;
import com.entity.StudentEntity;

public class StudentAddressDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

//	@NotNull
//	@NotBlank
//	@Size(min = 2, max = 35)
	private String doorNo;

//	@NotNull
//	@NotBlank
//	@Size(min = 2, max = 35)
	private StateEntity state;

	private StudentEntity studentEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public StateEntity getState() {
		return state;
	}

	public StudentEntity getStudentEntity() {
		return studentEntity;
	}

	public void setStudentEntity(StudentEntity studentEntity) {
		this.studentEntity = studentEntity;
	}

	public void setState(StateEntity state) {
		this.state = state;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}