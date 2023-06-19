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
@Table(name = "STUDENTADDRESS")
public class StudentAddressEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "studentEntity_id")
	private Long id;

	@Column(name = "STUDENT_DOORNO")
	private String doorNo;

	@OneToOne(cascade = CascadeType.ALL)
	private StateEntity state;

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

	public void setState(StateEntity state) {
		this.state = state;
	}

	public StudentAddressEntity(long studentPincode, String doorNo, StateEntity state, StudentEntity studentEntity) {
		super();
		this.id = studentPincode;
		this.doorNo = doorNo;
		this.state = state;
	}

	public StudentAddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentAddressEntity [studentPincode=" + id + ", doorNo=" + doorNo + ", state=" + state + "]";
	}

}
