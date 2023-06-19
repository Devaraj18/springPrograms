package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class CityEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CITY_ID")
	private long cityId;

	@Column(name = "CITY_NAME")
	private String cityName;

	@Column(name = "CITY_CODE")
	private long cityCode;

	@Column(name = "STATE_NAME")
	private String stateName;

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

	public CityEntity(long cityId, String cityName, long cityCode, String stateName) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.cityCode = cityCode;
		this.stateName = stateName;
	}

	public CityEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CityEntity [cityId=" + cityId + ", cityName=" + cityName + ", cityCode=" + cityCode + ", stateName="
				+ stateName + "]";
	}
	
    
	
}
