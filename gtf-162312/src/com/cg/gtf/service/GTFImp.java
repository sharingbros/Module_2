package com.cg.gtf.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.gtf.dao.IGTFDAO;
import com.cg.gtf.entity.QueryMaster;

@Service
@Transactional
public class GTFImp implements IGTFService {

	@Autowired
	IGTFDAO dao;

	@Override
	public boolean addQuery(QueryMaster query_Master) {
		// TODO Auto-generated method stub
		return dao.addQuery(query_Master);
	}

	@Override
	public QueryMaster search(int id) {
		// TODO Auto-generated method stub
		return dao.search(id);
	}

}
