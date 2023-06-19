package com.studentresponse;

import org.springframework.data.domain.Sort;

public interface Pageable {
	int getPagenumber();

	int getPagesize();

	long getOffset();

	Sort getSort();

	Pageable next();

	Pageable previousOrFirst();

	Pageable first();

	boolean hasPrevious();

}
