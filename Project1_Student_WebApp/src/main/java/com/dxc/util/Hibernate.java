package com.dxc.util;

import org.hibernate.SessionFactory;

// A singleton class
public class Hibernate {
	
	// Prevents Instantiate
	private Hibernate(){}
	
	// Static factory pattern method allows to call from outside to obtain a single object
	public static SessionFactory getSessionFactory(){
		return null;
	}

}
