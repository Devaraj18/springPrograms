package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.CityEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.CityEntityRepository;

@Repository
public class CityEntityDaoImp implements CityEntityDao {

	@Autowired
	CityEntityRepository cityEntityRepository;

	@Override
	public CityEntity createCity(CityEntity cityEntity) {
		return cityEntityRepository.saveAndFlush(cityEntity);
	}

	@Override
	public CityEntity updateCity(CityEntity cityEntity) {
		CityEntity entity = cityEntityRepository.findById(cityEntity.getCityId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("city Entity is not Avaiable please checkout..");

		}
		return cityEntityRepository.saveAndFlush(cityEntity);
	}

	@Override
	public CityEntity fetchCity(long id) {
		return cityEntityRepository.findById(id).orElse(null);
	}

	@Override
	public CityEntity deleteCity(long id) {
		CityEntity city = fetchCity(id);
		cityEntityRepository.deleteById(id);
		return city;
	}

	@Override
	public List<CityEntity> fetchAll() {
		return cityEntityRepository.findAll();
	}

}
