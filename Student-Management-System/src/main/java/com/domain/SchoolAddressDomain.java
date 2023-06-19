package com.domain;

import java.io.Serializable;

public class SchoolAddressDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private long id;
	
	private String SchoolCity;
	
	private String SchoolState;
	
	private long pinCode;

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
		SchoolCity = schoolCity;
	}

	public String getSchoolState() {
		return SchoolState;
	}

	public void setSchoolState(String schoolState) {
		SchoolState = schoolState;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
