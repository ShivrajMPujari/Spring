package com.bridgeIt.jdbcPrax.resultSetExtractor;

import javax.sql.DataSource;

public class CompanyDao {

	DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}
	
	
}
