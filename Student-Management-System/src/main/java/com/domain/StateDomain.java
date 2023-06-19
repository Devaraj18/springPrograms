package com.domain;

import java.io.Serializable;

import com.entity.CityEntity;

public class StateDomain implements Serializable {

	private static final long serialVersionUID = 1L;

	private long stateId;

	private String stateName;

	private long stateCode;

	private String countryName;

	private CityEntity cityEntity;

	public long getStateId() {
		return stateId;
	}

	public void setStateId(long stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public long getStateCode() {
		return stateCode;
	}

	public void setStateCode(long stateCode) {
		this.stateCode = stateCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public CityEntity getCityEntity() {
		return cityEntity;
	}

	public void setCityEntity(CityEntity cityEntity) {
		this.cityEntity = cityEntity;
	}

}
