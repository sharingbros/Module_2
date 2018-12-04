package com.cg.querymaster.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="QueryMaster")
public class QueryMaster {

	@Id
	private int query_id;

	@Column(name="technology")
    private String technology;
	
	@Column(name="query")
	private String query;

	@Column(name="query_raised_by")
    private String query_raised_by;
	
	@Column(name="solutions")
    @NotEmpty(message="solutions should not be empty")
	private String solutions;
	
	@Column(name="solutionGivenBy")
	private String solutionGivenBy;

	public QueryMaster() {
		super();
	}

	public QueryMaster(int query_id, String technology, String query,
			String query_raised_by, String solutions, String solutionGivenBy) {
		super();
		this.query_id = query_id;
		this.technology = technology;
		this.query = query;
		this.query_raised_by = query_raised_by;
		this.solutions = solutions;
		this.solutionGivenBy = solutionGivenBy;
	}

	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getQuery_raised_by() {
		return query_raised_by;
	}

	public void setQuery_raised_by(String query_raised_by) {
		this.query_raised_by = query_raised_by;
	}

	public String getSolutions() {
		return solutions;
	}

	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}

	public String getSolutionGivenBy() {
		return solutionGivenBy;
	}

	public void setSolutionGivenBy(String solutionGivenBy) {
		this.solutionGivenBy = solutionGivenBy;
	}

	@Override
	public String toString() {
		return "QueryMaster [query_id=" + query_id + ", technology="
				+ technology + ", query=" + query + ", query_raised_by="
				+ query_raised_by + ", solutions=" + solutions
				+ ", solutionGivenBy=" + solutionGivenBy + "]";
	}
	
	
}
