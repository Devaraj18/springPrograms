package com.response;

import java.util.List;

import com.domain.StudentDomain;

public class StudentResponse 
{
	
    private int pageNo;
    private int pageSize;
    private List<StudentDomain> content;
    
    
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<StudentDomain> getContent() {
		return content;
	}
	public void setContent(List<StudentDomain> content) {
		this.content = content;
	}
    
    
}
