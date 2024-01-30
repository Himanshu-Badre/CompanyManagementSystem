package TechTeam.CompanyManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import TechTeam.CompanyManagement.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
