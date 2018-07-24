package com.bridgeIt.jdbcPrax.employeeDemo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private DataSource dataSource ;
	private JdbcTemplate template;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.template=new JdbcTemplate(dataSource);
	}
	
	public void save (int id, String name , String mailId){
		
	Object [] args = {id ,name , mailId};
	int out =template.update("insert into Employee values(?,?,?)",args);
	System.out.println("number rows affected "+out);
		
	}

	public List<Employee> allRecords() {
		
		List<Employee> employees= template.query("select * from Employee", new EmployeeMapper());
	
		return employees; 
	}
	
	public Employee fetchEmployeeById(int id ) {
		
		Object [] args = {id};
		Employee employee = null;
		try {
			employee = template.queryForObject("select * from Employee where id=?", args, new EmployeeMapper());
		} catch (Exception e) {
			System.out.println("your Id doesn't exist");
			employee=null;
		}
		return employee;
	}
	
	public void updateRecord(Employee emp) {
		System.out.println(emp);
		Object [] args = {emp.getName(),emp.getMailId(),emp.getId()};
		
		int out =template.update("update Employee set name = ? , mailId = ? where id = ? ", args);
		
		if(out==0) {
			System.out.println("Something went wrong");
		}else {
			System.out.println("Updated Sucessfully");
		}
	}
		
	
	public boolean deleteRecord(int id) {
		Object [] args = {id};
		int out;
		try {
			out = template.update("delete from Employee where id =?", args);
			System.out.println("number rows affected "+out);
			return true;
		} catch (DataAccessException e) {

			return false;
		}
		
		
	}
}
