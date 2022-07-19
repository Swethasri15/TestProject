package com.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService es = (EmployeeService)ac.getBean("employeeService");
		
		List<Employee> listOfEmp = es.getAllEmployee();
		listOfEmp.forEach(emp->System.out.println(emp));
		
//		Employee emp = (Employee)ac.getBean("employee");
//		emp.setId(105);
//		emp.setName("Rinku");
//		emp.setSalary(50000);
//		String result = es.storeEmployee(emp);
//		System.out.println(result);
	}

}
