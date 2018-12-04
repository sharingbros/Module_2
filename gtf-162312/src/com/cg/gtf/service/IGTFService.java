package com.cg.gtf.service;

import com.cg.gtf.entity.QueryMaster;

public interface IGTFService {
	boolean addQuery(QueryMaster query_Master);

	QueryMaster search(int id);
}
