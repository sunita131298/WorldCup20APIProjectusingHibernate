package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	public 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//all players whose name start with s
	
//	@GetMapping("/maxx")
//	 public List<CrickStaff> findFirstByOrderByStaffNoOfYaersToBCCIDesc() {
//	        return service.findFirstByOrderByStaffNoOfYaersToBCCIDesc();
//	    }
	
	
	
	
	
//	@GetMapping("/searchByName/{staffId}")
//	public List<CrickStaff> searchByName(@PathVariable int staffId ) {
//	    return service.searchByName(staffId);
//	}
//	
//	@PostMapping("/max")
//	public CrickStaff maxYearTowork() {
//		return service.maxYearTowork();
//		
//	}

}
