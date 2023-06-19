package com.curd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.curd.entity.Employee;
import com.curd.exceptionHandling.EmployeeNotFoundException;
import com.curd.repo.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepo empRepository;

	@Override
	public Long saveEmployee(Employee employee) {
		Long id = empRepository.save(employee).getEmpId();
		return id;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list = empRepository.findAll();
		return list;
	}

	@Override
	public Employee getOneEmployee(Long id) {
		Optional<Employee> opt = empRepository.findById(id);

		Employee emp = opt.orElseThrow(() -> new EmployeeNotFoundException("Employee data not found: "));
		return emp;

		/*
		 * or else we use this
		 * 
		 * Employee emp1 = null; if(opt.isPresent()) { emp1 = opt.get(); }else { throw
		 * new EmployeeNotFoundException("Employee data not found: "); } return emp1;
		 */
	}

	@Override
	public void deleteEmployee(Long id) {
		Employee emp = getOneEmployee(id);
		empRepository.delete(emp);
	}

	/*
	 * @Override public void updateEmployee(Employee emp) { empRepository.save(emp);
	 * 
	 * }
	 */
	
	// for sorting proposes this API 
	@Override
	public List<Employee> fetchAllByField(String field) {
		return empRepository.findAll(Sort.by(Sort.Direction.ASC,field));
	}

	@Override
	public Page<Employee> getEmployeePagination(Integer pageNumber, Integer pageSize, String sort) {
		
		Pageable pageable = null;
	    if (sort != null) {
	      // with sorting
	      pageable = PageRequest.of(pageNumber, pageSize, Sort.Direction.DESC, sort);
	    } else {
	      // without sorting
	      pageable = PageRequest.of(pageNumber, pageSize);
	    }
	    return empRepository.findAll(pageable);
	  
	}

	 

	 

}
