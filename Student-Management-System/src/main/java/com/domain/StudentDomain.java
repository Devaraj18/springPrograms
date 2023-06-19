package com.domain;

import java.io.Serializable;

import com.customvaildation.IsValidName;
import com.entity.StudentAddressEntity;

public class StudentDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	// @NotNull
	// @NotBlank
	// @Pattern(regexp = "[A-Za-z]")
	@IsValidName
	private String firstName;

	@IsValidName
	private String lastName;

	// @NotNull
	// @NotBlank
	// @Size(min = 2, max = 35)
	private String studentClass;

	// @NotNull
	// @NotBlank
	// @Size(max = 3)
	private long studnetAge;

	// @NotNull
	// @NotBlank
	// @Size(max = 10)
	private long studentPhone;

	private long totalElements;

	private long totalRecords;

	private StudentAddressEntity studentAddressEntity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public long getStudnetAge() {
		return studnetAge;
	}

	public void setStudnetAge(long studnetAge) {
		this.studnetAge = studnetAge;
	}

	public long getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(long studentPhone) {
		this.studentPhone = studentPhone;
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

	public StudentAddressEntity getStudentAddressEntity() {
		return studentAddressEntity;
	}

	public void setStudentAddressEntity(StudentAddressEntity studentAddressEntity) {
		this.studentAddressEntity = studentAddressEntity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
