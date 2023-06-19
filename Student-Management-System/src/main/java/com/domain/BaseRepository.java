package com.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class BaseRepository implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private Integer pageNumber;

	@JsonIgnore
	private Integer pageSize;

	@JsonIgnore
	private String fetchType;

	public Integer getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public String getFetchType() {
		return fetchType;
	}

	public void setFetchType(String fetchType) {
		this.fetchType = fetchType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BaseRepository(Integer pageNumber, Integer pageSize, String fetchType) {
		super();
		this.pageNumber = pageNumber;
		this.pageSize = pageSize;
		this.fetchType = fetchType;
	}

	public BaseRepository() {
		super();
	}

}