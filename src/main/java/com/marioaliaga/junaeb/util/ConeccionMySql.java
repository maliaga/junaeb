package com.marioaliaga.junaeb.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConeccionMySql {
	
	 public Connection getConection() {
	        Connection cn = null;

	        try {
	            Class.forName("com.mysql.jdbc.Driver").newInstance();
	            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/junaeb", "maliaga", "123456");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }


	        return cn;
	    }

}
