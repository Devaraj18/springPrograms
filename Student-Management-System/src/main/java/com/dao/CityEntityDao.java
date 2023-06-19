package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.CityEntity;

@Repository
public interface CityEntityDao {
	CityEntity createCity(CityEntity cityEntity);

	CityEntity updateCity(CityEntity cityEntity);

	CityEntity fetchCity(long id);

	CityEntity deleteCity(long id);

	List<CityEntity> fetchAll();

}
