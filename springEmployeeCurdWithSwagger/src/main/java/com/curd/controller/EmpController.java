package com.curd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curd.entity.Employee;
import com.curd.service.EmpService;

@RestController
@RequestMapping("/employees")
public class EmpController {

	@Autowired
	private EmpService service;

	// Save
	@PostMapping("/create")
	public ResponseEntity<String> saveEmployee(@RequestBody Employee employee) {

		Long id = service.saveEmployee(employee);
		return new ResponseEntity<String>("Employee " + id + " saved", HttpStatus.OK);
	}

	// Fetch all
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		List<Employee> list = service.getAllEmployee();
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}

	// Fetch one
	@GetMapping("/getOne/{id}")
	public ResponseEntity<Employee> getOneEmployee(@PathVariable Long id) {
		Employee employee = service.getOneEmployee(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	// Delete Employee
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		return new ResponseEntity<String>("Employee " + id + " deleted", HttpStatus.OK);

	}

	// Update BY Id
	@PutMapping("/modify/{id}")
	public ResponseEntity<String> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		Employee db = service.getOneEmployee(id);
		db.setEmpName(employee.getEmpName());
		db.setEmpSal(employee.getEmpSal());
		db.setEmpDept(employee.getEmpDept());
		service.saveEmployee(db);
		return new ResponseEntity<String>("Employee " + id + " updated", HttpStatus.OK);
	}

	// Find All with field
	@GetMapping("/allEmployeeBy/{field}")
	public ResponseEntity<List<Employee>> findAllwithfield(@PathVariable String field) {
		List<Employee> allEmployee = service.fetchAllByField(field);
		return new ResponseEntity<List<Employee>>(allEmployee, HttpStatus.OK);

	}

	/*
	 * Employee data Pagination with URL
	 * 
	 * @GetMapping("/empPagination/{pageNumber}/{pageSize}") 
	 * public ResponseEntity<List<Employee>> getEmployees(
	 * @PathVariable Integer pageNumber, @PathVariable Integer pageSize) {
	 * 
	 * Page <Employee> dataDb = service.getEmployeePagination(pageNumber, pageSize, null); 
	 * return new ResponseEntity<List<Employee>>(dataDb.getContent(), HttpStatus.OK);
	 * 
	 *  }
	 */ 

	// Employees data Pagination with Params
	@GetMapping("/pagination")
	public ResponseEntity<List<Employee>> getEmployeesWithPage(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "1") Integer pageNumber,
			@RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit) {
		 Page<Employee> dataDb = service.getEmployeePagination(pageNumber, limit, null);
		 dataDb.getContent();
		return new ResponseEntity<List<Employee>>(dataDb.getContent(), HttpStatus.OK);
	}

}
