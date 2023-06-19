package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.domain.StateDomain;

@Service
public interface StateService {
	StateDomain createState(StateDomain stateDomain);

	StateDomain updateState(StateDomain stateDomain);

	StateDomain fetchState(long id);

	StateDomain deleteState(long id);

	List<StateDomain> fetchAll();

}
