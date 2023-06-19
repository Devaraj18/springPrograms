package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StateEntityDao;
import com.domain.StateDomain;
import com.entity.StateEntity;
import com.objectcopier.ObjectCopier;

@Service
public class StateServiceImp implements StateService {

	@Autowired
	StateEntityDao stateEntityDao;

	@Transactional
	public StateDomain createState(StateDomain stateDomain) {

		return toDomain(stateEntityDao.createState(toEntity(stateDomain)));
	}

	@Transactional
	public StateDomain updateState(StateDomain stateDomain) {

		return toDomain(stateEntityDao.updateState(toEntity(stateDomain)));
	}

	public StateDomain fetchState(long id) {

		return toDomain(stateEntityDao.fetchState(id));
	}

	@Transactional
	public StateDomain deleteState(long id) {

		return toDomain(stateEntityDao.deleteState(id));
	}

	// making To Domain method

	private StateDomain toDomain(StateEntity stateEntity) {
		StateDomain domain = null;
		if (stateEntity != null) {
			domain = new com.domain.StateDomain();
			ObjectCopier.copyObject(stateEntity, domain);
		}
		return domain;
	}

	// making to Entity method
	private StateEntity toEntity(StateDomain stateDomain) {
		StateEntity entity = null;
		if (stateDomain != null) {
			entity = new com.entity.StateEntity();
			ObjectCopier.copyObject(stateDomain, entity);
		}

		return entity;
	}

	@Override
	public List<StateDomain> fetchAll() {
		return toDomain(stateEntityDao.fetchAll());
	}

	private List<StateDomain> toDomain(List<StateEntity> stateEntity) {
		List<StateDomain> list = new ArrayList<>();

		for (com.entity.StateEntity state : stateEntity) {
			list.add(toDomain(state));
		}
		return list;
	}
}
