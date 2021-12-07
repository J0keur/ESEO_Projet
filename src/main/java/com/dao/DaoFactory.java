package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

	private static String url="jdbc:mysql://localhost:3306/twic";
	
    private static String username="root";
    
    private static String password="network";
    
    private static Connection connection=null;

    DaoFactory() {
    }
	

	public Connection getConnection() throws SQLException {
		connection= DriverManager.getConnection(url, username, password);		
		return connection;
	}
	
	public static DaoFactory getInstance() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {

        }
        DaoFactory instance = new DaoFactory();
        return instance;
	}

}
