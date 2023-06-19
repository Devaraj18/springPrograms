package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.StateEntity;
import com.notfoundexception.StudentNotFoundException;
import com.repository.StateEntityRepository;

@Repository
public class StateEntityDaoImp implements StateEntityDao {
	@Autowired
	StateEntityRepository stateEntityRepository;

	@Override
	public StateEntity createState(StateEntity stateEntity) {
		return stateEntityRepository.saveAndFlush(stateEntity);
	}

	@Override
	public StateEntity updateState(StateEntity stateEntity) {
		StateEntity entity = stateEntityRepository.findById(stateEntity.getStateId()).orElse(null);
		if (entity == null) {
			throw new StudentNotFoundException("State Entity is not Available please checkout..");
		}
		return stateEntityRepository.saveAndFlush(stateEntity);
	}

	@Override
	public StateEntity fetchState(long id) {
		return stateEntityRepository.findById(id).orElse(null);
	}

	@Override
	public StateEntity deleteState(long id) {
		StateEntity state = fetchState(id);
		stateEntityRepository.deleteById(id);
		return state;
	}

	@Override
	public List<StateEntity> fetchAll() {
		return stateEntityRepository.findAll();
	}

}
