package com.charishma.spring_orm_hibernate;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.charishma.spring_orm_hibernate.dao.EmployeeDao;
import com.charishma.spring_orm_hibernate.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao dao = context.getBean("employeeDao", EmployeeDao.class);
        
        Employee newEmployee = new Employee();
        newEmployee.setId(1);
        newEmployee.setName("Mark");
        newEmployee.setEmail("m@gmail.com");
        
        int result =  dao.addEmployee(newEmployee);
        System.out.println("("+result+") rows inserted...");
        		
        
        
    }
}
