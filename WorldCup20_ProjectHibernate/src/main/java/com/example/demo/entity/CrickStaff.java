package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CrickStaff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	int staffId;
	String staffName;
	String staffDept;
	int staffAge;
	String staffNoOfYaersToBCCI;
	
	public CrickStaff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CrickStaff(int staffId, String staffName, String staffDept, int staffAge, String staffNoOfYaersToBCCI) {
		super();
		this.staffId = staffId;
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAge = staffAge;
		this.staffNoOfYaersToBCCI = staffNoOfYaersToBCCI;
	}
	public CrickStaff(String staffName, String staffDept, int staffAge, String staffNoOfYaersToBCCI) {
		super();
		this.staffName = staffName;
		this.staffDept = staffDept;
		this.staffAge = staffAge;
		this.staffNoOfYaersToBCCI = staffNoOfYaersToBCCI;
	}
	public int getStaffId() {
		return staffId;
	}
	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public String getStaffDept() {
		return staffDept;
	}
	public void setStaffDept(String staffDept) {
		this.staffDept = staffDept;
	}
	public int getStaffAge() {
		return staffAge;
	}
	public void setStaffAge(int staffAge) {
		this.staffAge = staffAge;
	}
	public String getStaffNoOfYaersToBCCI() {
		return staffNoOfYaersToBCCI;
	}
	public void setStaffNoOfYaersToBCCI(String staffNoOfYaersToBCCI) {
		this.staffNoOfYaersToBCCI = staffNoOfYaersToBCCI;
	}
	@Override
	public String toString() {
		return "CrickStaff [staffId=" + staffId + ", staffName=" + staffName + ", staffDept=" + staffDept
				+ ", staffAge=" + staffAge + ", staffNoOfYaersToBCCI=" + staffNoOfYaersToBCCI + "]";
	}
	
	
	
	
	
	
	
	
	

}
