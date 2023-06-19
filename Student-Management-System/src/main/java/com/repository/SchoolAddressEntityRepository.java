package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.SchoolAddressEntity;

@Repository
public interface SchoolAddressEntityRepository extends JpaRepository<SchoolAddressEntity, Long>{

}
