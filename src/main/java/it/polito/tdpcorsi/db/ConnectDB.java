package it.polito.tdpcorsi.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	public static Connection getConnection() {
		
		try {
			String url="jdbc:mysql://localhost/iscritticorsi?user=root&password=Carola2806";
			return DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println("Errore di connessione");
			e.printStackTrace();
			return null;
		}
	}

}
