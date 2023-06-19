package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="SCHOOL_ADDRESS")
public class SchoolAddressEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="SCHOOL_ADDRESS_ID")
	private Long id;
	
	@Column(name="SCHOOL_CITY")
	private String SchoolCity;
	
	@Column(name="SCHOOL_STATE")
	private String SchoolState;
	
	@Column(name="SCHOOL_PINCODE")
	private Long pinCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSchoolCity() {
		return SchoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.SchoolCity = schoolCity;
	}

	public String getSchoolState() {
		return SchoolState;
	}

	public void setSchoolState(String schoolState) {
		this.SchoolState = schoolState;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public SchoolAddressEntity(long id, String schoolCity, String schoolState, long pinCode) {
		super();
		this.id = id;
		this.SchoolCity = schoolCity;
		this.SchoolState = schoolState;
		this.pinCode = pinCode;
	}

	public SchoolAddressEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SchoolAddressEntity [id=" + id + ", SchoolCity=" + SchoolCity + ", SchoolState=" + SchoolState
				+ ", pinCode=" + pinCode + "]";
	}

	
	

	
	
	

}
