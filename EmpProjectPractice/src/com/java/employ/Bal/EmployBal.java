package com.java.employ.Bal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.java.exception.EmployException;
import com.java.employ.dao.EmployDao;
import com.java.employ.dao.EmployDaoImpl;
import com.java.employ.model.Employ;

public class EmployBal {
	
	
    // DAO object to interact with the data source

	static EmployDao employDao;
	
    // StringBuilder to accumulate validation error messages

	static StringBuilder sb;
	
	
    // Static block to initialize DAO and StringBuilder

	static {
		employDao = new EmployDaoImpl();
		sb = new StringBuilder();
	}
	
	
    // Retrieves a list of all employees.
	public List<Employ> showEmployBal(){
		return employDao.showEmployDao();
	}
	
	public Employ searchEmployBal(int empno) {
		return employDao.searchEmployDao(empno);
	}
	
	public String removeEmployBal(int empno) {
		return employDao.removeEmployDao(empno);
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if(validateEmploy(employ) == true) {
			return employDao.updateEmployDao(employ);
		}
		throw new EmployException(sb.toString());
	}
	
	public String addEmployBal(Employ employ) throws EmployException {
		if(validateEmploy(employ) == true) {
			return employDao.addEmployDao(employ);
		}
		
		throw new EmployException(sb.toString());
	}
	

	public static boolean validateEmploy(Employ employ) {
		boolean isValid = true;
		
		if(employ.getName().length() < 5) {
			sb.append("Employ Name contains min 5 characters...\r\n");
			isValid = false;
		}
		if(employ.getDept().length() < 3) {
			sb.append("Employ dept contains min 3 characters...\r\n");
			isValid = false;
		}
		if(employ.getBasic() < 10000 || employ.getBasic()>80000 ) {
			sb.append("Employ Name contains min 5 characters...\r\n");
			isValid = false;
		}
		
		return isValid;
	}

}
