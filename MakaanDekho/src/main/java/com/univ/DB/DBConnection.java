package com.univ.DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection implements DBConfig {
public static Connection getConn()
  {
	Connection con=null;
	try {
     Class.forName(Driver);
    
	con=DriverManager.getConnection(url,unm,pw);		
	}catch(Exception tt)
	{System.out.println(tt);}
	return con;
  }
}
