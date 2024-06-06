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


	
    //10 year above exprience name
	public List<String> yearExpTenYear() {
		List<CrickStaff> alist = dao.allIndianCksInformation();//to doa all data get
		ArrayList<String> yearexpList=new ArrayList<>();// list of year
		int max=10;
		for (CrickStaff crickStaff : alist) {//only 10year experice 
        int yearofexp = crickStaff.getStaffNoOfYaersToBCCI();
         if(yearofexp > max) {
        	 yearexpList.add(crickStaff.getStaffName());
         }
		}
		return yearexpList;
	}

//below age 30
	public List<String> staffAgeBelowThirty() {
		List<CrickStaff> crickStaffslist=dao.allIndianCksInformation();
		ArrayList<String> ageBelow= new ArrayList<>();
		int max=30;
		for (CrickStaff crikstaff :crickStaffslist) {
			int age = crikstaff.getStaffAge();
			
			if(age<30) {
				ageBelow.add(crikstaff.getStaffName());
				
			}
		}
			
		
		return ageBelow;
	}

//only medical staff
	
	public List<String> staffNameOnlyMedical() {
		List<CrickStaff> mediacalList = dao.allIndianCksInformation();
		ArrayList<String> mednames= new ArrayList<>();
		for (CrickStaff allmedstaff : mediacalList) {
			mednames.add(allmedstaff.getStaffmedical());
			
		}
		return mednames;
	}

//addition of exp years of medical players
	public List<String> additionodExpYearMedCount() {
		List<CrickStaff> crickStaffslist=dao.allIndianCksInformation();
		ArrayList<String> medicalstaff=new ArrayList<>();
		for (CrickStaff cricketStaf : crickStaffslist) {
			if(cricketStaf.getStaffDept().equals(medicalstaff)) {
				medicalstaff.add(cricketStaf.getStaffName());
			}
			
		}
		return medicalstaff;
	}


	public void insertCrickStaff(CrickStaff crickStaff) {
		dao.insertCrickStaff( crickStaff);
		
	}


	public void updateCrickStaff(CrickStaff crickStaff) {
		dao.updateCrickStaff(crickStaff);
		
	}		

}
