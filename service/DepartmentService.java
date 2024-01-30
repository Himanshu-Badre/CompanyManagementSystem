package TechTeam.CompanyManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TechTeam.CompanyManagement.dao.DepartmentRepository;
import TechTeam.CompanyManagement.entity.Department;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentrepository;
	
	public Department create(Department department) {
		return departmentrepository.save(department);
	}
	
	public Department findbyid(Long id) {
		return departmentrepository.findById(id).get();
	}
	
	public List<Department> findAll(){
		return departmentrepository.findAll();

		}
	public void deletebyid(Long id) {
		 departmentrepository.deleteById(id);
	}
	
	public void deleteAll(Department department) {
		departmentrepository.deleteAll();
	}
	
	public Department updateDepartment(Department correctdepartment,Long id ) {
		Department department=departmentrepository.findById(id).get();
		
		if(department.getAge()!=0) {
			 department.setAge(correctdepartment.getAge());
			 
		}
		if(department.getId()!=null) {
			department.setId(correctdepartment.getId());
		}
		if(department.getName()!=null) {
			department.setName(correctdepartment.getName());
		}
		if(department.getPosition()	!=null){
			department.setPosition(correctdepartment.getPosition());
		}
		if(department.getSalary()!=0) {
			department.setSalary(correctdepartment.getSalary());
		}
		return departmentrepository.save(department);
	
	}

}
