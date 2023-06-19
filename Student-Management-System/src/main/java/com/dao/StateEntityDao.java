package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entity.StateEntity;

@Repository
public interface StateEntityDao {
	StateEntity createState(StateEntity stateEntity);

	StateEntity updateState(StateEntity stateEntity);

	StateEntity fetchState(long id);

	StateEntity deleteState(long id);

	List<StateEntity> fetchAll();

}
