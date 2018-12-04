package com.cg.querymaster.service;

import com.cg.querymaster.dto.QueryMaster;

public interface IQueryService {

	public QueryMaster search(int id);

    public boolean update(QueryMaster queryMaster);
}
