package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class EmployJdbcBean
 */
@Stateless
@Remote(EmployJdbcBeanRemote.class)
public class EmployJdbcBean implements EmployJdbcBeanRemote {

	
	static EmployDao daoImpl;
	static {
		daoImpl=new EmployDaoImpl();
	}
    /**
     * Default constructor. 
     */
    public EmployJdbcBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.showEmployDao();
	}

	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.searchEmployDao(empno);
	}

	@Override
	public String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.addEmployDao(employ);
	}

	@Override
	public String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.deleteEmployDao(empno);
	}

	@Override
	public String updateEmployDao(Employ employNew) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return daoImpl.updateEmployDao(employNew);
	}

}
