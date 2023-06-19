package com.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Repository;

import com.entity.SchoolEntity;



@Repository
public interface SchoolEntityDao {
	
	SchoolEntity createSchool(SchoolEntity schoolEntity);

	SchoolEntity updateSchool(SchoolEntity schoolEntity);

	SchoolEntity fetchSchool(long id);

	Boolean deleteSchool(long id);
	


	Page<SchoolEntity> fetchSchoolDetails(Integer offset, Integer limit, String Sortby);


}
