package com.example.Residents_Association.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Residents_Association.Entity.Resident;
import com.example.Residents_Association.Service.ApiService;

@CrossOrigin
@RestController
public class ApiController {
   @Autowired
   private ApiService residentservice;
   @PostMapping("/addresident")
   public String postDetails(@RequestBody Resident r) {
	   residentservice.savedetails(r);
	   return "Resident Successfully Added";
   }
   
   @GetMapping("/getResident")
   public List<Resident> getAllDetails(){
	   return residentservice.getAllDetails();
   }
   
   @GetMapping("/{pgno}/{pgsize}")
   public List<Resident>listing(@PathVariable("pgno")int pgno,@PathVariable("pgsize")int pgsize){
	   return residentservice.findall(pgno, pgsize);
   }
  
   @PutMapping("/{id}")
   public Resident updateResidentById(@PathVariable int id, @RequestBody Resident r) {
       return residentservice.updateResidentById(id, r);
   }
   @DeleteMapping("/delete/{id}")

   public String deleteResidentById(@PathVariable("id") int id) {
       if(residentservice.deleteResidentById(id))
    	   return "Deleted successfully";
       return "Id not found";
   }
   @PutMapping("/update/{id}")
   public Resident updateResidentById1(@PathVariable int id, @RequestBody Resident r) {
       return residentservice.updateResidentById(id, r);
   }
}
