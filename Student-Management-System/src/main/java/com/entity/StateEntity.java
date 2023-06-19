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
@Table(name = "STATE")
public class StateEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "STATE_ID")
	private long stateId;

	@Column(name = "STATE_NAME")
	private String stateName;

	@Column(name = "STATE_CODE")
	private long stateCode;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@OneToOne(cascade = CascadeType.ALL)
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

	public void setStateCode(Long stateCode) {
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

	public StateEntity(long stateId, String stateName, long stateCode, String countryName, CityEntity cityEntity) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.stateCode = stateCode;
		this.countryName = countryName;
		this.cityEntity = cityEntity;
	}

	public StateEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}