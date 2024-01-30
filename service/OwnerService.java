package TechTeam.CompanyManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TechTeam.CompanyManagement.dao.OwnerRepository;
import TechTeam.CompanyManagement.entity.Owner;

@Service
public class OwnerService {

		@Autowired
		OwnerRepository ownerRepository;
		
		public Owner saveowner(Owner owner) {
			return ownerRepository.save(owner);
		}
		
		public Owner findbyid(Long id) {
			return ownerRepository.findById(id).get();
		}
		
		public List<Owner> findAll() {
			return ownerRepository.findAll();
		}
		
		public void deletebyid(Long id) {
			ownerRepository.deleteById(id);
		}
		
		public void deleteAll(Owner owner) {
			ownerRepository.deleteAll();
		}
		
		public Owner updateOwner(Owner correctOwner, Long id) {
			Owner owner=ownerRepository.findById(id).get();
			
			if(owner.getAge()!=0) {
				owner.setAge(correctOwner.getAge());
			}
			if(owner.getDesignation()!=null) {
				owner.setDesignation(correctOwner.getDesignation());
			}
			if(owner.getEducation()!=null) {
				owner.setEducation(correctOwner.getEducation());
			}
			if(owner.getEmail()!=null) {
				owner.setEmail(correctOwner.getEmail());
			}
			if(owner.getLocation()!=null) {
				owner.setLocation(correctOwner.getLocation());
			}
			if(owner.getMobno()!=null) {
				owner.setMobno(correctOwner.getMobno());
			}
			if(owner.getName()!=null) {
				owner.setName(correctOwner.getName());
			}
			if(owner.getSalary()!=null) {
				owner.setSalary(correctOwner.getSalary());
			}
			return ownerRepository.save(owner);
		}
}
