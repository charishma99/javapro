package Thejdbccode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class ConnectionFactory{

	    private static Connection conn = null;

	    public static Connection getConnection() throws SQLException {
	        if(conn==null){
	            ResourceBundle bundle = ResourceBundle.getBundle("Thejdbccode/dbConfig");
	            String dc = bundle.getString("driverClass");
	            String url = bundle.getString("url");
	            String username = bundle.getString("username");
	            String password = null;

	            conn = DriverManager.getConnection(url, username, password);
	        }
	        return conn;
	    }
	}


