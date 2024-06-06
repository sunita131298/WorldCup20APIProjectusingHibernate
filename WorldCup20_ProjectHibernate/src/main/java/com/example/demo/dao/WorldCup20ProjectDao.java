package com.example.demo.dao;

import java.util.HashMap;
import java.util.List;

import javax.persistence.criteria.Order;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CrickStaff;



@Repository
public class WorldCup20ProjectDao {
	@Autowired
	SessionFactory factory;
	private Object staffNoOfYaersToBCCI;

	public List<CrickStaff> allIndianCksInformation() {
		System.err.println("factory----"+factory);
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(CrickStaff.class);
		List<CrickStaff> crList=criteria.list();
		
		return crList;
	}

	public void insertCrickStaff(CrickStaff crickStaff) {
		Session session=factory.openSession();
		Transaction txx=session.beginTransaction();
		session.save(crickStaff);
		txx.commit();
		
	}

	public void updateCrickStaff(CrickStaff crickStaff) {
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		session.update(crickStaff);
	tx.commit();
	
	}
}
