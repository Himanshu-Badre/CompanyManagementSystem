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

import TechTeam.CompanyManagement.entity.Owner;
import TechTeam.CompanyManagement.service.OwnerService;

@RestController
@RequestMapping("/owner")
public class OwnerController {

		@Autowired
		OwnerService ownerService;
		
		@PostMapping("/save")
		private Owner saveowner(@RequestBody Owner owner) {
			return ownerService.saveowner(owner); 
		}
		
		@GetMapping("/find/{id}")
		private Owner findbyid(@PathVariable Long id) {
			return ownerService.findbyid(id);
		}
		
		@GetMapping("/findAll")
		private List<Owner> findAll(){
			return ownerService.findAll();
		}
		
		@DeleteMapping("/delete/{id}")
		private String deletebyid(@PathVariable Long id) {
			ownerService.deletebyid(id);
			return "Owner Deleted By Id Successfully";
		}
		
		@DeleteMapping("/deleteAll")
		private String deleteall(Owner owner) {
			ownerService.deleteAll(owner);
			return "All Owner Deleted Successfully";
		}
		
		@PutMapping("/update/{id}")
		private Owner updateOwner(@RequestBody Owner owner,@PathVariable Long id) {
			return ownerService.updateOwner(owner, id);
		}

}
