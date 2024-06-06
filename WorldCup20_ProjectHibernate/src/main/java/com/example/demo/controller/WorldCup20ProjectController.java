package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CrickStaff;
import com.example.demo.service.WorldCup20ProjectService;

@RestController
@RequestMapping("/World")
public class WorldCup20ProjectController {
	@Autowired
	 WorldCup20ProjectService service;
	
	//Count only staff
	@GetMapping("/totalcricksstaff")
	public int allIndianCksStaffCount() {
		return service.allIndianCksStaffCount();
	
		}
	
	//All data 
	@GetMapping("/list")
	public ResponseEntity<List<CrickStaff>> allIndianCksdata(){
		List<CrickStaff> cs=service.allIndianCksdata();
		return ResponseEntity.ok(cs);
		
	}
	
	//name and age
	@GetMapping("/nameage")
	public HashMap<String, Integer> fetchIndianCktNameWithAge(){
	 return service.fetchIndianCktNameWithAge();
	
	}
	//all staffname
	@GetMapping("staffname")
	public List<String> allIndianCksStaffName() {
		return service.allIndianCksStaffName();
	}
	
	//all departmentaname
	@GetMapping("/staffdep")
	public List<String> allcksstaffDept(){
		return service.allcksstaffDept();
		
	}
	//10 year above need names
	@GetMapping("/stafftenyear")
	public List<String> yearExpTenYear(){
		return service.yearExpTenYear();
		
		
	}
	@GetMapping("/staffAgebelowthirty")
	public List<String> staffAgeBelowThirty(){
		return service.staffAgeBelowThirty();
		
	}
	
	@GetMapping("/medicalstaff")
	public List<String> staffNameOnlyMedical(){
		return service.staffNameOnlyMedical();
		
	}
	
	 //addition of exp years of medical players
	@GetMapping("/additionodExpYearMedCount")
	public List<String> additionodExpYearMedCount() {
		return service.additionodExpYearMedCount();
	
		}
	
	@PostMapping("/insertCrickStaff")
	public void insertCrickStaff(@RequestBody CrickStaff crickStaff) {
		System.out.println(" Cric staff datafrom postman "+crickStaff);
		service.insertCrickStaff(crickStaff);
	}
	@PutMapping("updateCrickStaff")
	public void updateCrickStaff(@RequestBody CrickStaff crickStaff) {
		System.out.println(" Cric staff datafrom postman "+crickStaff);
		service.updateCrickStaff(crickStaff);
		
	}
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	