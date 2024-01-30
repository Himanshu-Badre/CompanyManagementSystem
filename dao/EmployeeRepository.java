package TechTeam.CompanyManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import TechTeam.CompanyManagement.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
