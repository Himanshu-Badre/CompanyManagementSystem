package TechTeam.CompanyManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TechTeam.CompanyManagement.entity.Employee;
import TechTeam.CompanyManagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService service;

	@PostMapping("/save")
	private Employee saveEmployee(@RequestBody Employee employee) {
		return service.createEmployee(employee);
	}

	@GetMapping("/find/{id}")
	private Employee findEmployeeById(@PathVariable Long id) {
		return service.getEmployeeById(id);
	}

	@GetMapping("/findAll")
	private List<Employee> findAlEmployees() {
		return service.getAllEmployee();
	}

	@DeleteMapping("/delete/{id}")
	private String deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		return "Employee Deleted Successfully";
	}
	
	@PutMapping("/update/{id}")
	private Employee updateEmployee(@RequestBody Employee employee, @PathVariable Long id) {
		return service.updateEmployee(employee, id);
	}

}
