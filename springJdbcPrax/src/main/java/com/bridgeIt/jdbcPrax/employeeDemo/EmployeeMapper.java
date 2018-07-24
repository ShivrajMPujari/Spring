package com.bridgeIt.jdbcPrax.employeeDemo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

/*	private Employee employee;
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}*/

	public Employee mapRow(ResultSet set, int arg1) throws SQLException {
		
		Employee employee = new Employee();
		employee.setId(set.getInt("id"));
		employee.setName(set.getString("name"));
		employee.setMailId(set.getString("mailId"));
		
		return employee;
	}


}
