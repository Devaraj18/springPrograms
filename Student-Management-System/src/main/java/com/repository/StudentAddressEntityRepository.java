package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.StudentAddressEntity;

@Repository
public interface StudentAddressEntityRepository extends JpaRepository<StudentAddressEntity, Long> {

}
