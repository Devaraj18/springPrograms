package com.curd.ObjectCopier;

import org.springframework.beans.BeanUtils;

public class ObjectCopier {
	
	public static void copyObject(Object source, Object target) {

		if (source == null) {
			throw new IllegalArgumentException("Source object should not be null");
		}

		if (target == null) {
			throw new IllegalArgumentException("Target object should not be null");
		}

		BeanUtils.copyProperties(source, target);

	}

}
