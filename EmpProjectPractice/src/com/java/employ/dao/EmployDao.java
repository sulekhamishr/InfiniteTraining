package com.java.employ.dao;

import java.util.List;

import com.java.employ.model.Employ;

public interface EmployDao {
    List<Employ> showEmployDao();                      // Returns all employees
    Employ searchEmployDao(int empno);                 // Search by empno
    String addEmployDao(Employ employ);                // Add new employee
    String updateEmployDao(Employ employ);             // Update employee
    String removeEmployDao(int empno);                 // Delete employee
    String writeEmployFileDao(int empno);              // Serialize to file
    String readEmployFileDao(int empno);               // Deserialize from file
}
