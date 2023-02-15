package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.Employeedao;
import dto.Employee;

public class Class extends GenericServlet{

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=arg0.getParameter("empid");
		int empid=Integer.parseInt(s1);
		String empname=arg0.getParameter("empname");
		String dob=arg0.getParameter("dob");
		String gender=arg0.getParameter("gender");
		String country=arg0.getParameter("country");
		
		
		Employee employee1=new Employee();
		employee1.setEmpid(empid);
		employee1.setEmpname(empname);
		employee1.setDate(dob);
		employee1.setGender(gender);
		employee1.setCountry(country);
		
		Employeedao employeedao=new Employeedao();
		employeedao.insert(employee1);
	}

}
