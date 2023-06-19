package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.TeacherEntity;
@Repository
public interface TeacherEntityRepository extends JpaRepository<TeacherEntity, Long>{

}
