package com.ezio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezio.Entity.Employee;

public interface EmployeeReposity extends JpaRepository<Employee, Long> {

}
