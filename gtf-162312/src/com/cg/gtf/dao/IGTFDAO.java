package com.cg.gtf.dao;

import com.cg.gtf.entity.QueryMaster;

public interface IGTFDAO {
	boolean addQuery(QueryMaster query_Master);
	QueryMaster search(int id);
}
