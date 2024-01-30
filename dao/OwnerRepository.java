package TechTeam.CompanyManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import TechTeam.CompanyManagement.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
