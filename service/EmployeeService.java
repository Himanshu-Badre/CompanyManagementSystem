package TechTeam.CompanyManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TechTeam.CompanyManagement.dao.EmployeeRepository;
import TechTeam.CompanyManagement.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repository ;
	
	
	public Employee createEmployee(Employee employee) {
		return repository.save(employee);
	}
	
	public Employee getEmployeeById(Long id) {
		return repository.findById(id).get();
	}
	
	public List<Employee> getAllEmployee(){
		return repository.findAll();
	}
	
	public void deleteEmployee(Long id) {
		repository.deleteById(id);
	}


	public Employee updateEmployee(Employee correctEmployee, Long id) {
		Employee employee = repository.findById(id).get();
		
		if(employee.getName() != null) {
			employee.setName(correctEmployee.getName());
		}
		if(employee.getAddress() != null) {
			employee.setAddress(correctEmployee.getAddress());
		}			
		return repository.save(employee);
	}
	

}
