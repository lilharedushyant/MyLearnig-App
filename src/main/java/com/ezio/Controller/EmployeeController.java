package com.ezio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ezio.Entity.Employee;
import com.ezio.Service.EmployeeService;

import jakarta.websocket.server.PathParam;

//@Controller // dont have @ResponseBody ==>

@RestController // @Controller + @ResponseBody  --> JSON

public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/save-employee")
	public String saveEmployee(@RequestBody Employee emp) {

		service.saveEmployee(emp);

		return "saved";
	}

	@GetMapping("/read-all-employee")
	public List<Employee> findAllEmployeeDetails() {

		return service.findAllEmployee();
	}

	@GetMapping("/get-employe-by-id/{empId}")
	public Employee getEmployeeDetails(@PathVariable("empId") Long empId) {

		return service.getEmployeeById(empId);
	}

}
