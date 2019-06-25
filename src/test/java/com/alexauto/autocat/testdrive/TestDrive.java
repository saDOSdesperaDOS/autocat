package com.alexauto.autocat.testdrive;

import com.alexauto.autocat.services.AutoPartServices;

public class TestDrive {
	public static void main(String[] args) {
		try {
	        Class.forName("com.mysql.jdbc.Driver");
	        System.out.println("class found");
	    }catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    }
		
	AutoPartServices a = new AutoPartServices();
	System.out.println(a.find("191951221"));
	
	}
	
}
