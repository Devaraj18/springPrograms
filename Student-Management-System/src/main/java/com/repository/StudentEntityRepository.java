package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.StudentEntity;

@Repository
public interface StudentEntityRepository extends JpaRepository<StudentEntity, Long> {

}
