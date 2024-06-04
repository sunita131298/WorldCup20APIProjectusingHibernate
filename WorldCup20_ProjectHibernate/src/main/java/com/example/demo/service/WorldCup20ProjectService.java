package com.example.demo.service;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.dialect.function.StandardAnsiSqlAggregationFunctions.MaxFunction;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.MAX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.WorldCup20ProjectDao;
import com.example.demo.entity.CrickStaff;

@Service
public class WorldCup20ProjectService {
	@Autowired
	WorldCup20ProjectDao dao;

	
	public int allIndianCksStaffCount() {
		List<CrickStaff> crickstaff =dao.allIndianCksInformation();
		return crickstaff.size();
	}


	public List<CrickStaff> allIndianCksdata() {
		List<CrickStaff> csk=dao.allIndianCksInformation();
		
		return csk;
	}


	public HashMap<String, Integer> fetchIndianCktNameWithAge() {
		HashMap<String, Integer> mapNameAge= new HashMap<String, Integer>();
		List<CrickStaff> cktStaff	=dao.allIndianCksInformation();
			for (CrickStaff crickStaffs : cktStaff) {
				mapNameAge.put(crickStaffs.getStaffName(),crickStaffs.getStaffAge());
				
			}
		return mapNameAge;
	}

	
	
	public List<String> allIndianCksStaffName() {
		List<CrickStaff> crickstaff=dao.allIndianCksInformation();
		ArrayList<String> stfname=new ArrayList<>();
		for (CrickStaff crickStaff2 : crickstaff) {
			stfname.add(crickStaff2.getStaffName());
		}
		return stfname;
	}


	public List<String> allcksstaffDept() {
		List<CrickStaff> crickdepnames=dao.allIndianCksInformation();
		ArrayList<String> stfdep=new ArrayList<>();
		for (CrickStaff crcikd : crickdepnames) {
			stfdep.add(crcikd.getStaffDept());
			
		}
		return stfdep;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	 public CrickStaff getCrickStaffWithMaxYearsToBCCI() {
//		 dao.getCrickStaffWithMaxYearsToBCCI();
//		 
//	        C crickStaffList = CrickStaff.findAll();
//	        return crickStaffList.stream()
//	                .max(Comparator.comparing(CrickStaff::getStaffNoOfYaersToBCCI))
//	                .orElse(null);
//	    }


//	public List<CrickStaff> findFirstByOrderByStaffNoOfYaersToBCCIDesc() {
//		List<CrickStaff> maxyear =dao.getCrickStaffWithMaxYearsToBCCI();
//		for (CrickStaff crickStaff : maxyear) {
//			if(crickStaff.getStaffNoOfYaersToBCCI()>maxyear) {
//				maxyear=crickStaff.getStaffNoOfYaersToBCCI();
//				
//				
//			}
//			
//		}
//		return maxyear;
//		
//	}
	

//	public List<CrickStaff> searchByName(int staffId) {
//		List<CrickStaff> listt =dao.searchByName(staffId);
//		return listt;
//	}
//
//
//	public CrickStaff maxYearTowork() {
//		CrickStaff max=dao.maxYearTowork();
//		return max;
//	}
//

	



	

		

}
