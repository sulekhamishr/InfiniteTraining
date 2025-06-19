package com.java.controller;

import com.java.hib.dao.EmployeeDao;
import com.java.hib.model.Employee;

public class Controller {

	
	private Employee employee;
    private String userName;
    private int otpNo;
	private String password;
    private String message;
    private EmployeeDao employeeDao;
	
    public int getOtpNo() {
		return otpNo;
	}

	public void setOtpNo(int otpNo) {
		this.otpNo = otpNo;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}
	public String addEmployee() {
	    String isAdded = employeeDao.addEmployee(employee); 
		return isAdded;
	  
	}



	// Generate password using OTP
    public String generatePassword() {
        message = employeeDao.generatePassword(userName,otpNo);
        return "Login.jsp?faces-redirect=true";
    }

  
}
