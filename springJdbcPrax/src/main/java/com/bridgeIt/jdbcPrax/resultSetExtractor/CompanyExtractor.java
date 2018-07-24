package com.bridgeIt.jdbcPrax.resultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class CompanyExtractor implements ResultSetExtractor<Company>{

	public Company extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		return null;
	}

	
}
