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

import TechTeam.CompanyManagement.entity.Department;
import TechTeam.CompanyManagement.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService departmentservice;
	
     @PostMapping("/save")
	private Department save(@RequestBody Department department) {
		return departmentservice.create(department);
	}
	
	@GetMapping("/find/{id}")
	private Department findbyid(@PathVariable Long id) {
		return departmentservice.findbyid(id);
	}
	
	@GetMapping("/findAll")
	private List<Department>findAll(){
		return departmentservice.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	private String deletebyid(@PathVariable Long id) {
	 departmentservice.deletebyid(id);
	 return"delete id successfully";
	}
	
	@DeleteMapping("/deleteAll")
	private String deleteAll(Department department) {
		departmentservice.deleteAll(department);
		return"Department Delete Successfully";
	}
	
	@PutMapping("/update/{id}")
	private Department updateDepartment(@RequestBody Department department ,@PathVariable Long id) {
		return departmentservice.updateDepartment(department, id);
	}
	
}
