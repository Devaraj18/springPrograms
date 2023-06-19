package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.domain.CityDomain;

@Service
public interface CityService {

	CityDomain createCity(CityDomain cityDomain);

	CityDomain updateCity(CityDomain cityDomain);

	CityDomain fetchCity(long id);

	CityDomain deleteCity(long id);

	List<CityDomain> fetchAll();

}
