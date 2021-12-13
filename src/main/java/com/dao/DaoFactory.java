package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoFactory {

	private static String url="jdbc:mysql://localhost:3306/ville_france_mysql";
	
    private static String username="root";
    
    private static String password="network";
    
    private static Connection connection=null;

    DaoFactory() {
    }
	

	public Connection getConnection() throws SQLException {
		connection= DriverManager.getConnection(url, username, password);	
		//System.out.println("je suis connecte");
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
	
	public VilleDAO getVilleDao() {
		return new VilleDAO(this);
	}

}
