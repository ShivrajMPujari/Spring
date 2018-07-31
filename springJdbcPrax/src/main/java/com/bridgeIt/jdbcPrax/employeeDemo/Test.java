package com.bridgeIt.jdbcPrax.employeeDemo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("employee.xml");
		Employee employee=context.getBean(Employee.class);
		EmployeeDao dao=context.getBean(EmployeeDao.class);
		context.close();
		
		
		List list = (List) dao.fetchEmployeeById(3);
		System.out.println(list.size());
		int loop=1;
/*		while(loop==1) {
		
		System.out.println("Employee Info:-");
		System.out.println("1.Add employee \n2.Update Employee\n3.View Employees \n4.Remove Employee \n5.exit");
		
		Scanner sc = new Scanner(System.in);
		int choice= sc.nextInt();
		
		switch (choice) {
		case 1:{
			
			
			System.out.println("Enter the id of the Employee");
			int id=sc.nextInt();
			employee.setId(id);
			System.out.println("Enter the name of the Employee");
			String name=sc.next();
			employee.setName(name);
			System.out.println("Enter the mail Id of Employee");
			String mail=sc.next();
			employee.setMailId(mail);
			dao.save(employee.getId(), employee.getName(), employee.getMailId());
			break;
				}	
		
		case 2:{
			
			System.out.println("Enter the id of the Employee to update");
			int id=sc.nextInt();
			Employee fetchedEmp =dao.fetchEmployeeById(id);
			System.out.println("Id :-"+fetchedEmp.getId()+" Name:- "+fetchedEmp.getName()+" MailId:-"+fetchedEmp.getMailId());
			System.out.println("enter your choice to edit:- \n1.Name \n2.MailID");
			int want = sc.nextInt();
			
			switch (want) {
			case 1:{
				System.out.println("Enter new UserName");
				String name=sc.next();
				fetchedEmp.setName(name);
				dao.updateRecord(fetchedEmp);
				break;
			}
			case 2:{
				System.out.println("Enter new Mail Id");
				String mail = sc.next();
				fetchedEmp.setMailId(mail);
				dao.updateRecord(fetchedEmp);
				break;
			}	

			default:{
				System.out.println("entered wrong option");
				break;}
			}
			break;
			
		}
		case 3:{
			List<Employee> employees=dao.allRecords();
			System.out.println(employees);
			break;
		}
		case 4:{
			System.out.println("Enter the Id OF employee ");
			int givenId = sc.nextInt();
			if(dao.deleteRecord(givenId)) {
				System.out.println("Records removed sucessfully");
			}else {
				System.out.println("Incorrect Id given");
			}
		break;
		}
		case 5:{
			sc.close();
			loop=2;
			break;
		}

		default:{
		System.out.println("invalid choice");
			break;
		}
			
		}

	}*/
	}
}
