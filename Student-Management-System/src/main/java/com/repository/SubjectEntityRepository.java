package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.SubjectEntity;

@Repository
public interface SubjectEntityRepository extends JpaRepository<SubjectEntity, Long>{

}
