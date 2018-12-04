package com.cg.querymaster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.querymaster.dao.IQueryDAO;
import com.cg.querymaster.dto.QueryMaster;

@Service("queryService")
@Transactional
public class QueryServiceImpl implements IQueryService {

	@Autowired
	IQueryDAO queryDAO;
	
	@Override
	public QueryMaster search(int id) {
		// TODO Auto-generated method stub
		return queryDAO.search(id);
	}

	@Override
	public boolean update(QueryMaster queryMaster) {
		// TODO Auto-generated method stub
		return queryDAO.update(queryMaster);
	}

}
