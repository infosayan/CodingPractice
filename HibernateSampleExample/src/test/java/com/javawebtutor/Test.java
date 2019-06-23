package com.javawebtutor;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Test {
	public static void main(String[] args) {
		saveRole("Student");
		
		saveRole("User");
		
		saveUser();
		
		/*float f1 = -343; 
		float f2 = 3.14; 
		float f3 = 0x12345; 
		float f4 = 42e7; 
		float f5 = 2001.0D; 
		float f6 = 2.81F;*/
		
		
	
	}
	
	/* Method to CREATE an employee in the database */
	   public static void saveRole(String userRole){
		   Session session = HibernateUtil.getSessionFactory().openSession();

			Transaction  tx=null;
	      try {
	    	  tx=session.beginTransaction();
	  		System.out.println("Transtion started");
	  		Role role = new Role();
	  		role.setRole(userRole);
	  		session.save(role);
	  		tx.commit();
	  		//session.flush();
	  		System.out.println("Role saved successfully");
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	    	 session.close(); 
	      }
	    
	   }
	   
	   /* Method to CREATE an employee in the database */
	   public static void saveUser(){
		   Session session = HibernateUtil.getSessionFactory().openSession();

			Transaction  tx=null;
	      
	      try {
	    	  tx=session.beginTransaction();
	    	  User user = new User();
	  		user.setUsername("Sayan");
	  		user.setUserRole("Admin");
	  		user.setCreatedBy("Google");
	  		user.setCreatedDate(new Date());
	  		session.save(user);
	  		tx.commit();
	  		System.out.println("Transtion ended");
	  	 } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      
	   }

}
