package com.curd.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curd.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee, Long> {


}
