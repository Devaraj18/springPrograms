package com.curd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.curd.entity.Employee;
import com.curd.repo.EmpRepo;
import com.curd.service.EmpServiceImpl;

@SpringBootTest(classes= {EmpServiceMockitoTests.class})
public class EmpServiceMockitoTests {
	
// we need to Mock the Repository to use the their method  because,
// Repository methods are connected with database, so mock that class
	@Mock
	EmpRepo empRepository; // External dependence
	
//  @InjectMocks creates actual objects and injects mocked dependencies into it.
	@InjectMocks
	EmpServiceImpl empServiceImpl;
	
// create a List variable to story the data mock data 	
	public List<Employee> mockEmployees;
	
	@Test        //To inform the spring this is test method
	@Order(1)    //To apply an Order 
	public void test_getAllEmployee() {
		List<Employee> mockEmployees =new ArrayList<Employee>();
		mockEmployees.add(new Employee(1L,"Devaraj",30000.20,"developer"));
		mockEmployees.add(new Employee(1L,"Ranjith",90000.40,"developer and manager"));
		mockEmployees.add(new Employee(1L,"Madhu",40000.30,"Teamlead"));
		
		when(empRepository.findAll()).thenReturn(mockEmployees);   // mocking
		assertEquals(3,empServiceImpl.getAllEmployee().size());
	}
	
	@Test
	@Order(2)
	public void test_getOneEmployee() {
		//Optional<Employee> optEmp = Optional.empty();
		Employee mockEmployees =new Employee();
		mockEmployees.setEmpId(1L);
		mockEmployees.setEmpName("Devaraj");
		mockEmployees.setEmpSal(2000.00);
		mockEmployees.setEmpDept("java");
		Long empId =1L;
		
		when(empRepository.findById(empId)).thenReturn(Optional.of(mockEmployees));
		assertEquals(empId, empServiceImpl.getOneEmployee(empId).getEmpId());
		
	}

}
