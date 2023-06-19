package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CityEntityDao;
import com.domain.CityDomain;
import com.entity.CityEntity;
import com.objectcopier.ObjectCopier;

@Service
public class CityServiceImp implements CityService {

	@Autowired
	CityEntityDao cityEntityDao;

	@Transactional
	public CityDomain createCity(CityDomain cityDomain) {

		return toDomain(cityEntityDao.createCity(toEntity(cityDomain)));
	}

	@Transactional
	public CityDomain updateCity(CityDomain cityDomain) {

		return toDomain(cityEntityDao.updateCity(toEntity(cityDomain)));
	}

	public CityDomain fetchCity(long id) {

		return toDomain(cityEntityDao.fetchCity(id));
	}

	@Transactional
	public CityDomain deleteCity(long id) {

		return toDomain(cityEntityDao.deleteCity(id));
	}

	// making To Domain method

	private CityDomain toDomain(CityEntity cityEntity) {
		CityDomain domain = null;
		if (cityEntity != null) {
			domain = new com.domain.CityDomain();
			ObjectCopier.copyObject(cityEntity, domain);
		}
		return domain;
	}

	// making to Entity method
	private CityEntity toEntity(CityDomain cityDomain) {
		CityEntity entity = null;
		if (cityDomain != null) {
			entity = new com.entity.CityEntity();
			ObjectCopier.copyObject(cityDomain, entity);
		}

		return entity;
	}

	@Override
	public List<CityDomain> fetchAll() {
		return toDomain(cityEntityDao.fetchAll());
	}

	private List<CityDomain> toDomain(List<CityEntity> cityEntity) {
		List<CityDomain> list = new ArrayList<>();

		for (com.entity.CityEntity city : cityEntity) {
			list.add(toDomain(city));
		}
		return list;
	}


}
