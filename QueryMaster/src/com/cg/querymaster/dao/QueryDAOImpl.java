package com.cg.querymaster.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.querymaster.dto.QueryMaster;

@Repository("queryDAO")
public class QueryDAOImpl implements IQueryDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public QueryMaster search(int id) {
		// TODO Auto-generated method stub
		QueryMaster queryMaster=entityManager.find(QueryMaster.class, id);
		return queryMaster;
	}

	@Override
	public boolean update(QueryMaster queryMaster) {
		// TODO Auto-generated method stub
		try{
			entityManager.merge(queryMaster);
			entityManager.flush();
			return true;
		}
		catch(Exception e){
		return false;
		}
		}

}
