package com.curd.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import com.curd.entity.Employee;

@Service
public interface EmpService {
	
	Long saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getOneEmployee(Long id);
	void deleteEmployee(Long id);
	//void updateEmployee(Employee emp); 
	List<Employee> fetchAllByField(String field);
	Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize, String sort);

}
