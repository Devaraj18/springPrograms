package com.service;

import org.springframework.stereotype.Service;

import com.domain.SubjectDomain;

@Service
public interface SubjectService {
	
	SubjectDomain createSubject(SubjectDomain subjectDomain);
	
	SubjectDomain updateSubject(SubjectDomain subjectDomain);
	
	SubjectDomain fetchSubject(long id);
	
	Boolean deleteSubject(long id);

}
