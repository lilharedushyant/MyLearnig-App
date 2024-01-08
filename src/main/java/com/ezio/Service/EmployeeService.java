package com.ezio.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezio.Entity.Employee;
import com.ezio.Repository.EmployeeReposity;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeReposity repo;

	public void saveEmployee(Employee emp) {

		repo.save(emp);

	}

	public List<Employee> findAllEmployee() {

		return repo.findAll();

	}

	public Employee getEmployeeById(Long id) {

		return repo.findById(id).get();
	}

}
