package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DemoTest {

	public static void main(String[] args) {
		//Employee emp = new Employee();
		//emp.displayInfo();
		
		Resource res = new ClassPathResource("beans.xml"); 	// load xml file
		BeanFactory bean = new XmlBeanFactory(res); 		// get the bean reference
		
//		Employee emp1 = (Employee)bean.getBean("obj1");
//		emp1.displayInfo();
//		
//		Employee emp2 = (Employee)bean.getBean("obj1");
//		emp2.displayInfo();
//		
//		Employee emp3 = (Employee)bean.getBean("obj2");
//		emp3.displayInfo();
//		
//		Employee emp4 = (Employee)bean.getBean("obj2");
//		emp4.displayInfo();
		
//		Employee emp5 = (Employee)bean.getBean("obj1");
//		System.out.println(emp5);
//		
//		Employee emp6 = (Employee)bean.getBean("obj3");
//		System.out.println(emp6);
//		
//		Employee emp7 = (Employee)bean.getBean("obj4");
//		System.out.println(emp7);
		
		Address add1 = (Address)bean.getBean("add1");
		System.out.println(add1);
		
		Employee emp7 = (Employee)bean.getBean("emp1");
		System.out.println(emp7);
	}

}
