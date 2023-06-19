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
@Table(name = "STUDENT")

public class StudentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST__NAME")
	private String lastName;

	@Column(name = "STUDENT_CLASS")
	private String studentClass;

	@Column(name = "STUDENT_AGE")
	private long studnetAge;

	@Column(name = "STUDENT_PHONENO")
	private long studentPhone;

	@OneToOne(cascade = CascadeType.ALL)
	private StudentAddressEntity studentAddressEntity;

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

	public StudentAddressEntity getStudentAddressEntity() {
		return studentAddressEntity;
	}

	public void setStudentAddressEntity(StudentAddressEntity studentAddressEntity) {
		this.studentAddressEntity = studentAddressEntity;
	}

	public StudentEntity(long id, String firstName, String lastName, String studentClass, long studnetAge,
			long studentPhone, StudentAddressEntity studentAddressEntity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentClass = studentClass;
		this.studnetAge = studnetAge;
		this.studentPhone = studentPhone;
		this.studentAddressEntity = studentAddressEntity;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", studentClass="
				+ studentClass + ", studnetAge=" + studnetAge + ", studentPhone=" + studentPhone
				+ ", studentAddressEntity=" + studentAddressEntity + "]";
	}

	public Object thenReturn(StudentEntity studentEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
