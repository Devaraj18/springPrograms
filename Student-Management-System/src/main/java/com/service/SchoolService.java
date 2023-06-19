package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.domain.SchoolDomain;

@Service
public interface SchoolService 
{

	SchoolDomain createSchool(SchoolDomain schoolDomain);
	
	SchoolDomain updateSchool(SchoolDomain schoolDomain);
	
	SchoolDomain fetchSchool(long id);
	
	Boolean deleteSchool(long id);
	
	List<SchoolDomain> fetchSchoolDetails(Integer offset, Integer limit, String Sortby);
	
	

}
