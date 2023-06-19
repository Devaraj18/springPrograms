package com.domain;

import java.io.Serializable;

import com.entity.SchoolAddressEntity;

public class CityDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	private long cityId;

	private String cityName;

	private long cityCode;

	private String stateName;

	private SchoolAddressEntity schoolAddressEntity;
	
	
	public SchoolAddressEntity getSchoolAddressEntity() {
		return schoolAddressEntity;
	}

	public void setSchoolAddressEntity(SchoolAddressEntity schoolAddressEntity) {
		this.schoolAddressEntity = schoolAddressEntity;
	}

	public long getCityId() {
		return cityId;
	}

	public void setCityId(long cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public long getCityCode() {
		return cityCode;
	}

	public void setCityCode(long cityCode) {
		this.cityCode = cityCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
