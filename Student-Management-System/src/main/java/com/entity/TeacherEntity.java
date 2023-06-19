package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TEACHER")
public class TeacherEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="TEACHER_ID")
	private long id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="PHONE_NUMBER")
	private long phoneNumber;
	
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToMany(cascade = CascadeType.ALL)
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

	public List<SubjectEntity> getSubjectEntity() {
		return subjectEntity;
	}

	public void setSubjectEntity(List<SubjectEntity> subjectEntity) {
		this.subjectEntity = subjectEntity;
	}

	public TeacherEntity(long id, String firstName, String lastName, long phoneNumber,
			List<SubjectEntity> subjectEntity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.subjectEntity = subjectEntity;
	}

	public TeacherEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

		

}
