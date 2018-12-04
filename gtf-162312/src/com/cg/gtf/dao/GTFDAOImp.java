package com.cg.gtf.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.gtf.entity.QueryMaster;

@Repository
public class GTFDAOImp implements IGTFDAO {

	@PersistenceContext
	EntityManager em;

	@Override
	public boolean addQuery(QueryMaster query_Master) {
		// TODO Auto-generated method stub

		em.merge(query_Master);
		em.flush();
		return true;
	}

	@Override
	public QueryMaster search(int id) {
		// TODO Auto-generated method stub

		QueryMaster bean = null;
		bean = em.find(QueryMaster.class, id);
		return bean;
	}

}
