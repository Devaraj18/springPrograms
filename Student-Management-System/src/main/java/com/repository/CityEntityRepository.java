package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entity.CityEntity;

public interface CityEntityRepository extends JpaRepository<CityEntity, Long> {

}
