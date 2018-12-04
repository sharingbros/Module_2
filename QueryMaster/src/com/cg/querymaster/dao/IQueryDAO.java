package com.cg.querymaster.dao;

import com.cg.querymaster.dto.QueryMaster;

public interface IQueryDAO {

	public QueryMaster search(int id);

	public boolean update(QueryMaster queryMaster);
}
